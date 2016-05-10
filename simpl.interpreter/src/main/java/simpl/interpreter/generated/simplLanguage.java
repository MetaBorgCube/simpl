package simpl.interpreter.generated;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import simpl.interpreter.generated.simplTermRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemContext;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemLanguage;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemPrimedRun;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRoot;
import org.spoofax.interpreter.terms.IStrategoTerm;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import com.oracle.truffle.api.vm.PolyglotEngine.Value;

@TruffleLanguage.Registration(name = "simpl", version = "0.1", mimeType = "application/x-simpl") public class simplLanguage extends DynSemLanguage 
{ 
  public final static String PARSE_TABLE = "src/main/resources/parsetable.tbl";

  public final static String START_SYMBOL = "Prog";

  public final static String SPEC_FILE = "src/main/resources/specification.aterm";

  public final static String MIME_TYPE = "application/x-simpl";

  public final static String START_CONSTR_NAME = "Program";

  public final static int START_CONSTR_ARITY = 1;

  public final static simplLanguage INSTANCE = new simplLanguage();

  public simplLanguage () 
  { 
    super();
    DynSemContext.LANGUAGE = this;
  }

  @Override public DynSemContext createDynSemContext(InputStream in, PrintStream out)
  { 
    return new DynSemContext(new simplTermRegistry(), new org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleRegistry(new File(SPEC_FILE)), Paths.get(PARSE_TABLE), in, out);
  }

  public static void main(String[] args) throws Exception
  { 
    RuleResult res = evaluate(args[0], System.in, System.out, System.err);
    System.out.println(res.result);
  }

  public static RuleResult evaluate(String file, InputStream input, OutputStream output, OutputStream error) throws Exception
  { 
    return getCallable(file, input, output, error).call();
  }

  public static Callable<RuleResult> getCallable(String file, InputStream input, OutputStream output, OutputStream error)
  { 
    PolyglotEngine vm = PolyglotEngine.newBuilder().setIn(input).setOut(output).setErr(error).build();
    assert vm.getLanguages().containsKey(MIME_TYPE);
    try
    { 
      vm.eval(Source.fromFileName(file).withMimeType(MIME_TYPE));
    }
    catch(IOException ioex)
    { 
      throw new RuntimeException("Eval failed", ioex);
    }
    Value prog = vm.findGlobalSymbol("INIT");
    return new Callable<RuleResult>()
           { 
             @Override public RuleResult call() throws Exception
             { 
               return prog.execute().as(RuleResult.class);
             }
           };
  }

  @Override protected CallTarget parse(Source code, Node context, String ... argumentNames) throws IOException
  { 
    DynSemContext ctx = getContext();
    IStrategoTerm programT = new org.metaborg.meta.lang.dynsem.interpreter.terms.ITermTransformer.IDENTITY().transform(ctx.getParser().parse(code, START_SYMBOL));
    ITerm program = ctx.getTermRegistry().parseProgramTerm(programT);
    RootNode rootNode = new RootNode(simplLanguage.class, null, null)
                        { 
                          @Override public Object execute(VirtualFrame frame)
                          { 
                            CompilerDirectives.transferToInterpreter();
                            RuleRoot initRuleRoot = ctx.getRuleRegistry().lookupRule("init", START_CONSTR_NAME, START_CONSTR_ARITY);
                            if(initRuleRoot == null)
                            { 
                              throw new IllegalStateException("Rule not found");
                            }
                            if(program instanceof ITerm)
                            { 
                              ITerm programCon = (ITerm)program;
                              if(programCon.constructor().equals(START_CONSTR_NAME) && programCon.arity() == START_CONSTR_ARITY)
                              { 
                                DynSemPrimedRun run = new DynSemPrimedRun();
                                run.setCallTarget(initRuleRoot.getCallTarget());
                                run.setProgram(programCon);
                                ctx.setRun(run);
                                return null;
                              }
                            }
                            throw new IllegalStateException("Malformed program term");
                          }
                        };
    return Truffle.getRuntime().createCallTarget(rootNode);
  }
}
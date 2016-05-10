package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.CompilerAsserts;

public abstract class IProgTerm  implements ITerm
{ 
  public static IProgTerm create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Program", 1))
    { 
      return Program_1_Term.create(term);
    }
    throw new IllegalStateException("Unsupported term: " + term);
  }
}
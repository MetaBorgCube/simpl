package simpl.interpreter.generated.terms.match;

import simpl.interpreter.generated.terms.Var_1_Term;
import simpl.interpreter.natives.*;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.MatchPattern;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public abstract class Var_1_TermMatchPattern extends MatchPattern 
{ 
  @Child protected MatchPattern p_1;

  public Var_1_TermMatchPattern (SourceSection source, MatchPattern p_1) 
  { 
    super(source);
    this.p_1 = p_1;
  }

  @Specialization public boolean doMatch(Var_1_Term term, VirtualFrame frame)
  { 
    return true && p_1.execute(term.get_1(), frame);
  }

  @Specialization public boolean doMatchFailed(Object term, VirtualFrame frame)
  { 
    return false;
  }
}
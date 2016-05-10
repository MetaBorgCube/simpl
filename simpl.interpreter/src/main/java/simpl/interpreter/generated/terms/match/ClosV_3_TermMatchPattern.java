package simpl.interpreter.generated.terms.match;

import simpl.interpreter.generated.terms.ClosV_3_Term;
import simpl.interpreter.natives.*;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.MatchPattern;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public abstract class ClosV_3_TermMatchPattern extends MatchPattern 
{ 
  @Child protected MatchPattern p_1;

  @Child protected MatchPattern p_2;

  @Child protected MatchPattern p_3;

  public ClosV_3_TermMatchPattern (SourceSection source, MatchPattern p_1, MatchPattern p_2, MatchPattern p_3) 
  { 
    super(source);
    this.p_1 = p_1;
    this.p_2 = p_2;
    this.p_3 = p_3;
  }

  @Specialization public boolean doMatch(ClosV_3_Term term, VirtualFrame frame)
  { 
    return true && p_1.execute(term.get_1(), frame) && p_2.execute(term.get_2(), frame) && p_3.execute(term.get_3(), frame);
  }

  @Specialization public boolean doMatchFailed(Object term, VirtualFrame frame)
  { 
    return false;
  }
}
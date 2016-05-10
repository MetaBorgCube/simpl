package simpl.interpreter.generated.terms.match;

import simpl.interpreter.generated.terms.bindVar_2_Term;
import simpl.interpreter.natives.*;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.MatchPattern;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;

public abstract class bindVar_2_TermMatchPattern extends MatchPattern 
{ 
  @Child protected MatchPattern p_1;

  @Child protected MatchPattern p_2;

  public bindVar_2_TermMatchPattern (SourceSection source, MatchPattern p_1, MatchPattern p_2) 
  { 
    super(source);
    this.p_1 = p_1;
    this.p_2 = p_2;
  }

  @Specialization public boolean doMatch(bindVar_2_Term term, VirtualFrame frame)
  { 
    return true && p_1.execute(term.get_1(), frame) && p_2.execute(term.get_2(), frame);
  }

  @Specialization public boolean doMatchFailed(Object term, VirtualFrame frame)
  { 
    return false;
  }
}
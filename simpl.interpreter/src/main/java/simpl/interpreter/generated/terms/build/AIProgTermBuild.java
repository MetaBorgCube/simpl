package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.IProgTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIProgTermBuild extends TermBuild 
{ 
  public AIProgTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public IProgTerm executeIProgTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIProgTerm(executeGeneric(frame));
  }
}
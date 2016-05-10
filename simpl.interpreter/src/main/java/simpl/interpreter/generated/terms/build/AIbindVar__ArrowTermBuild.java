package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.IbindVar__ArrowTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIbindVar__ArrowTermBuild extends TermBuild 
{ 
  public AIbindVar__ArrowTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public IbindVar__ArrowTerm executeIbindVar__ArrowTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIbindVar__ArrowTerm(executeGeneric(frame));
  }
}
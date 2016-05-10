package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.IreadVar__ArrowTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIreadVar__ArrowTermBuild extends TermBuild 
{ 
  public AIreadVar__ArrowTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public IreadVar__ArrowTerm executeIreadVar__ArrowTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIreadVar__ArrowTerm(executeGeneric(frame));
  }
}
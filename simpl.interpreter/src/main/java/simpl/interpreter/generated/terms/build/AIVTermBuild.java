package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.IVTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIVTermBuild extends TermBuild 
{ 
  public AIVTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public IVTerm executeIVTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIVTerm(executeGeneric(frame));
  }
}
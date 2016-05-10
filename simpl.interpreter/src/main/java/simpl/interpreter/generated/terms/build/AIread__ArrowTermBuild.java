package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.Iread__ArrowTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIread__ArrowTermBuild extends TermBuild 
{ 
  public AIread__ArrowTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public Iread__ArrowTerm executeIread__ArrowTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIread__ArrowTerm(executeGeneric(frame));
  }
}
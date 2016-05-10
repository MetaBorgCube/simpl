package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.Iwrite__ArrowTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIwrite__ArrowTermBuild extends TermBuild 
{ 
  public AIwrite__ArrowTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public Iwrite__ArrowTerm executeIwrite__ArrowTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIwrite__ArrowTerm(executeGeneric(frame));
  }
}
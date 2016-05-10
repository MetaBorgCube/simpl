package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.Iallocate__ArrowTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIallocate__ArrowTermBuild extends TermBuild 
{ 
  public AIallocate__ArrowTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public Iallocate__ArrowTerm executeIallocate__ArrowTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIallocate__ArrowTerm(executeGeneric(frame));
  }
}
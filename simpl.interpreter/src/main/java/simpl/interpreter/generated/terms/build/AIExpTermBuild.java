package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.IExpTerm;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.source.SourceSection;

public abstract class AIExpTermBuild extends TermBuild 
{ 
  public AIExpTermBuild (SourceSection source) 
  { 
    super(source);
  }

  public IExpTerm executeIExpTerm(VirtualFrame frame) throws UnexpectedResultException
  { 
    return TypesGen.expectIExpTerm(executeGeneric(frame));
  }
}
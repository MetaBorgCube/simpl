package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.*;
import simpl.interpreter.natives.*;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.*;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({@NodeChild(value = "tb_1", type = TermBuild.class), @NodeChild(value = "tb_2", type = TermBuild.class)}) public abstract class Fun_2_TermBuild extends AIExpTermBuild 
{ 
  public Fun_2_TermBuild (SourceSection source) 
  { 
    super(source);
  }

  @Specialization public Fun_2_Term doTyped(final String tb_1, final IExpTerm tb_2)
  { 
    return new Fun_2_Term(tb_1, tb_2);
  }
}
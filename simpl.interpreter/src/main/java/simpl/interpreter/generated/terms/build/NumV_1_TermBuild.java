package simpl.interpreter.generated.terms.build;

import simpl.interpreter.generated.terms.*;
import simpl.interpreter.natives.*;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.*;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChildren({@NodeChild(value = "tb_1", type = TermBuild.class)}) public abstract class NumV_1_TermBuild extends AIVTermBuild 
{ 
  public NumV_1_TermBuild (SourceSection source) 
  { 
    super(source);
  }

  @Specialization public NumV_1_Term doTyped(final int tb_1)
  { 
    return new NumV_1_Term(tb_1);
  }
}
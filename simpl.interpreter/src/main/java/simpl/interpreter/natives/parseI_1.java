package simpl.interpreter.natives;

import org.metaborg.dynsem.metainterpreter.generated.terms.IntT_1_Term;
import org.metaborg.dynsem.metainterpreter.generated.terms.StrT_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChild(value = "stringbuild", type = TermBuild.class)
public abstract class parseI_1 extends TermBuild {

	public parseI_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public IntT_1_Term doInt(StrT_1_Term s) {
		return new IntT_1_Term(Integer.parseInt(s.get_1()));
	}

	public static TermBuild create(SourceSection source, TermBuild stringbuild) {
		return parseI_1NodeGen.create(source, stringbuild);
	}
}

package simpl.interpreter.natives;

import org.metaborg.dynsem.metainterpreter.generated.terms.ITTerm;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChild(value = "vbuild", type = TermBuild.class)
public abstract class printV_1 extends TermBuild {

	public printV_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public ITTerm doInt(ITTerm v) {
		getContext().getOutput().println(v);
		return v;
	}

	public static TermBuild create(SourceSection source, TermBuild stringbuild) {
		return printV_1NodeGen.create(source, stringbuild);
	}
}

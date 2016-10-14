package simpl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChild(value = "stringbuild", type = TermBuild.class)
public abstract class unquoteS_1 extends TermBuild {

	public unquoteS_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public String doIt(String s) {
		return unquote(s);
	}

	@TruffleBoundary
	private String unquote(String s) {
		return s.substring(1, s.length() - 1);
	}

	public static TermBuild create(SourceSection source, TermBuild stringbuild) {
		return unquoteS_1NodeGen.create(source, stringbuild);
	}
}

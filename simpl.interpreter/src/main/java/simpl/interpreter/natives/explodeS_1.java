package simpl.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;
import org.metaborg.simpl.interpreter.generated.terms.List_String;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.source.SourceSection;

@NodeChild(value = "stringbuild", type = TermBuild.class)
public abstract class explodeS_1 extends TermBuild {

	public explodeS_1(SourceSection source) {
		super(source);
	}

	@Specialization
	public List_String doInt(String s) {
		return explode(s);
	}

	@TruffleBoundary
	private List_String explode(String s) {
		if(s.length() > 0){
			return new List_String(s.split(""));
		} else {
			return new List_String(new String[0]);
		}
	}

	public static TermBuild create(SourceSection source, TermBuild stringbuild) {
		return explodeS_1NodeGen.create(source, stringbuild);
	}
}

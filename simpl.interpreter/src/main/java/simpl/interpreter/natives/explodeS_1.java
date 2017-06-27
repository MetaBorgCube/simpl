package simpl.interpreter.natives;

import org.metaborg.dynsem.metainterpreter.generated.terms.ListT_1_Term;
import org.metaborg.dynsem.metainterpreter.generated.terms.List_ITTerm;
import org.metaborg.dynsem.metainterpreter.generated.terms.StrT_1_Term;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

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
	public ListT_1_Term doInt(StrT_1_Term s) {
		return explode(s.get_1());
	}

	@TruffleBoundary
	private ListT_1_Term explode(String s) {
		String[] chars = null;
		if(s.length() > 0){
			chars = s.split("");
		} else{
			chars = new String[0];
		}
		
		StrT_1_Term[] strTs = new StrT_1_Term[chars.length];
		for(int i = 0; i < chars.length; i++){
			strTs[i] = new StrT_1_Term(chars[i]);
		}
		return new ListT_1_Term(new List_ITTerm(strTs));
	}

	public static TermBuild create(SourceSection source, TermBuild stringbuild) {
		return explodeS_1NodeGen.create(source, stringbuild);
	}
}

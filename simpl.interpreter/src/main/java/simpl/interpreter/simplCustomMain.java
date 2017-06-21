package simpl.interpreter;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.io.FilenameUtils;
import org.metaborg.dynsem.metainterpreter.generated.terms.ITTerm;
import org.metaborg.meta.lang.dynsem.interpreter.DynSemLanguageParser;
import org.metaborg.meta.lang.dynsem.interpreter.IDynSemLanguageParser;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.TermFactory;
import org.spoofax.terms.io.TAFTermReader;

import com.oracle.truffle.api.source.Source;

import dynsem.metainterpreter.natives.DynSemCustomMain;

public class simplCustomMain {

	public final static String SPEC_FILE = "src/main/resources/simpl.core.nosug.aterm";
	public final static String PARSE_TABLE = "src/main/resources/parsetable.tbl";
	public final static String START_SYMBOL = "Prog";
	public final static String MIME_TYPE = "application/x-simpl";

	public static void main(String[] args) throws Exception {
		String filePath = args[0];
		Source programSource = Source.newBuilder(new File(filePath)).build();
		IStrategoTerm programTerm = createParser().parse(programSource);

		TAFTermReader specReader = new TAFTermReader(new TermFactory());
		IStrategoTerm specTerm = specReader.parseFromStream(getSpecificationTerm());
		ITTerm result = DynSemCustomMain.evaluate(programTerm, specTerm);
		System.out.println(result);
	}

	private static IDynSemLanguageParser createParser() {
		return new DynSemLanguageParser(
				simplCustomMain.class.getClassLoader().getResourceAsStream(FilenameUtils.getName(PARSE_TABLE)),
				START_SYMBOL);
	}

	private static InputStream getSpecificationTerm() {
		return simplCustomMain.class.getClassLoader().getResourceAsStream(FilenameUtils.getName(SPEC_FILE));
	}
}

package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.CompilerAsserts;

public abstract class Iread__ArrowTerm  implements ITerm
{ 
  public static Iread__ArrowTerm create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "read", 1))
    { 
      return read_1_Term.create(term);
    }
    throw new IllegalStateException("Unsupported term: " + term);
  }
}
package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.CompilerAsserts;

public abstract class Iwrite__ArrowTerm  implements ITerm
{ 
  public static Iwrite__ArrowTerm create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "write", 2))
    { 
      return write_2_Term.create(term);
    }
    throw new IllegalStateException("Unsupported term: " + term);
  }
}
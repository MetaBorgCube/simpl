package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.CompilerAsserts;

public abstract class IVTerm  implements ITerm
{ 
  public static IVTerm create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "NumV", 1))
    { 
      return NumV_1_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "BoxV", 1))
    { 
      return BoxV_1_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "ClosV", 3))
    { 
      return ClosV_3_Term.create(term);
    }
    throw new IllegalStateException("Unsupported term: " + term);
  }
}
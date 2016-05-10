package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.CompilerAsserts;

public abstract class IbindVar__ArrowTerm  implements ITerm
{ 
  public static IbindVar__ArrowTerm create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "bindVar", 2))
    { 
      return bindVar_2_Term.create(term);
    }
    throw new IllegalStateException("Unsupported term: " + term);
  }
}
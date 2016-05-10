package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.*;
import com.oracle.truffle.api.CompilerAsserts;

public abstract class IExpTerm  implements ITerm
{ 
  public static IExpTerm create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Lit", 1))
    { 
      return Lit_1_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Plus", 2))
    { 
      return Plus_2_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Minus", 2))
    { 
      return Minus_2_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Times", 2))
    { 
      return Times_2_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Let", 3))
    { 
      return Let_3_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Var", 1))
    { 
      return Var_1_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Box", 1))
    { 
      return Box_1_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Unbox", 1))
    { 
      return Unbox_1_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Setbox", 2))
    { 
      return Setbox_2_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "Fun", 2))
    { 
      return Fun_2_Term.create(term);
    }
    if(Tools.isTermAppl(term) && Tools.hasConstructor((IStrategoAppl)term, "App", 2))
    { 
      return App_2_Term.create(term);
    }
    throw new IllegalStateException("Unsupported term: " + term);
  }
}
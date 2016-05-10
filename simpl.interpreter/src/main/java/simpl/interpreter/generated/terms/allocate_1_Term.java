package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.*;
import simpl.interpreter.natives.*;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.ITermInstanceChecker;
import com.oracle.truffle.api.CompilerAsserts;

public class allocate_1_Term extends Iallocate__ArrowTerm 
{ 
  public final static String CONSTRUCTOR = "allocate";

  public final static int ARITY = 1;

  public allocate_1_Term (IVTerm _1) 
  { 
    this._1 = _1;
  }

  private final IVTerm _1;

  public IVTerm get_1()
  { 
    return _1;
  }

  public static allocate_1_Term create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    assert Tools.isTermAppl(term);
    assert Tools.hasConstructor((IStrategoAppl)term, CONSTRUCTOR, ARITY);
    return new allocate_1_Term(IVTerm.create(term.getSubterm(0)));
  }

  @Override public String constructor()
  { 
    return CONSTRUCTOR;
  }

  @Override public int arity()
  { 
    return ARITY;
  }

  @Override public Object[] allSubterms()
  { 
    return new Object[]{_1};
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    allocate_1_Term other = (allocate_1_Term)obj;
    if(_1 == null)
    { 
      if(other._1 != null)
      { 
        return false;
      }
    }
    else
      if(!_1.equals(other._1))
      { 
        return false;
      }
    return true;
  }

  @Override public ITermInstanceChecker getCheck()
  { 
    return new ITermInstanceChecker()
           { 
             @Override public boolean isInstance(Object obj)
             { 
               return TypesGen.isallocate_1_Term(obj);
             }
           };
  }
}
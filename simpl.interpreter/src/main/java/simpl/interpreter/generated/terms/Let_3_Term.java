package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.*;
import simpl.interpreter.natives.*;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.ITermInstanceChecker;
import com.oracle.truffle.api.CompilerAsserts;

public class Let_3_Term extends IExpTerm 
{ 
  public final static String CONSTRUCTOR = "Let";

  public final static int ARITY = 3;

  public Let_3_Term (String _1, IExpTerm _2, IExpTerm _3) 
  { 
    this._1 = _1;
    this._2 = _2;
    this._3 = _3;
  }

  private final String _1;

  private final IExpTerm _2;

  private final IExpTerm _3;

  public String get_1()
  { 
    return _1;
  }

  public IExpTerm get_2()
  { 
    return _2;
  }

  public IExpTerm get_3()
  { 
    return _3;
  }

  public static Let_3_Term create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    assert Tools.isTermAppl(term);
    assert Tools.hasConstructor((IStrategoAppl)term, CONSTRUCTOR, ARITY);
    return new Let_3_Term(Tools.stringAt(term, 0).stringValue(), IExpTerm.create(term.getSubterm(1)), IExpTerm.create(term.getSubterm(2)));
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
    return new Object[]{_1, _2, _3};
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    Let_3_Term other = (Let_3_Term)obj;
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
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
      { 
        return false;
      }
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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
               return TypesGen.isLet_3_Term(obj);
             }
           };
  }
}
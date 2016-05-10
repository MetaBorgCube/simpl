package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.*;
import simpl.interpreter.natives.*;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.ITermInstanceChecker;
import com.oracle.truffle.api.CompilerAsserts;

public class Fun_2_Term extends IExpTerm 
{ 
  public final static String CONSTRUCTOR = "Fun";

  public final static int ARITY = 2;

  public Fun_2_Term (String _1, IExpTerm _2) 
  { 
    this._1 = _1;
    this._2 = _2;
  }

  private final String _1;

  private final IExpTerm _2;

  public String get_1()
  { 
    return _1;
  }

  public IExpTerm get_2()
  { 
    return _2;
  }

  public static Fun_2_Term create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    assert Tools.isTermAppl(term);
    assert Tools.hasConstructor((IStrategoAppl)term, CONSTRUCTOR, ARITY);
    return new Fun_2_Term(Tools.stringAt(term, 0).stringValue(), IExpTerm.create(term.getSubterm(1)));
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
    return new Object[]{_1, _2};
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    Fun_2_Term other = (Fun_2_Term)obj;
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
    return true;
  }

  @Override public ITermInstanceChecker getCheck()
  { 
    return new ITermInstanceChecker()
           { 
             @Override public boolean isInstance(Object obj)
             { 
               return TypesGen.isFun_2_Term(obj);
             }
           };
  }
}
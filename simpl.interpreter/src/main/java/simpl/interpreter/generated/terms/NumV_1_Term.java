package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.*;
import simpl.interpreter.natives.*;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.ITermInstanceChecker;
import com.oracle.truffle.api.CompilerAsserts;

public class NumV_1_Term extends IVTerm 
{ 
  public final static String CONSTRUCTOR = "NumV";

  public final static int ARITY = 1;

  public NumV_1_Term (int _1) 
  { 
    this._1 = _1;
  }

  private final int _1;

  public int get_1()
  { 
    return _1;
  }

  public static NumV_1_Term create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    assert Tools.isTermAppl(term);
    assert Tools.hasConstructor((IStrategoAppl)term, CONSTRUCTOR, ARITY);
    return new NumV_1_Term(Tools.intAt(term, 0).intValue());
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
    NumV_1_Term other = (NumV_1_Term)obj;
    if(_1 != other._1)
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
               return TypesGen.isNumV_1_Term(obj);
             }
           };
  }
}
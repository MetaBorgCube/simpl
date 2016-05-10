package simpl.interpreter.generated.terms;

import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.terms.*;
import simpl.interpreter.natives.*;
import simpl.interpreter.generated.TypesGen;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.ITermInstanceChecker;
import com.oracle.truffle.api.CompilerAsserts;

public class ClosV_3_Term extends IVTerm 
{ 
  public final static String CONSTRUCTOR = "ClosV";

  public final static int ARITY = 3;

  public ClosV_3_Term (String _1, IExpTerm _2, com.github.krukow.clj_lang.IPersistentMap _3) 
  { 
    this._1 = _1;
    this._2 = _2;
    this._3 = _3;
  }

  private final String _1;

  private final IExpTerm _2;

  private final com.github.krukow.clj_lang.IPersistentMap _3;

  public String get_1()
  { 
    return _1;
  }

  public IExpTerm get_2()
  { 
    return _2;
  }

  public com.github.krukow.clj_lang.IPersistentMap get_3()
  { 
    return _3;
  }

  public static ClosV_3_Term create(IStrategoTerm term)
  { 
    CompilerAsserts.neverPartOfCompilation();
    assert term != null;
    assert Tools.isTermAppl(term);
    assert Tools.hasConstructor((IStrategoAppl)term, CONSTRUCTOR, ARITY);
    IStrategoAppl _s_1004 = Tools.applAt(term, 2);
    assert Tools.hasConstructor(_s_1004, "Map", 1);
    IStrategoList __s_10040 = Tools.listAt(_s_1004, 0);
    java.util.Map<String, IVTerm> ___s_100400 = new java.util.HashMap<String, IVTerm>(Math.round(__s_10040.size() / 0.75f), 0.75f);
    for(IStrategoTerm ____s_1004000 : __s_10040)
    { 
      assert Tools.isTermAppl(____s_1004000) && Tools.hasConstructor((IStrategoAppl)____s_1004000, "Bind", 2);
      ___s_100400.put(Tools.stringAt(____s_1004000, 0).stringValue(), IVTerm.create(____s_1004000.getSubterm(1)));
    }
    return new ClosV_3_Term(Tools.stringAt(term, 0).stringValue(), IExpTerm.create(term.getSubterm(1)), com.github.krukow.clj_lang.PersistentHashMap.create(___s_100400));
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
    ClosV_3_Term other = (ClosV_3_Term)obj;
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
               return TypesGen.isClosV_3_Term(obj);
             }
           };
  }
}
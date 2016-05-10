package simpl.interpreter.generated;

import java.util.HashMap;
import java.util.Map;
import simpl.interpreter.generated.terms.*;
import simpl.interpreter.generated.terms.build.*;
import simpl.interpreter.generated.terms.match.*;
import org.metaborg.meta.lang.dynsem.interpreter.terms.ITerm;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.metaborg.meta.lang.dynsem.interpreter.ITermRegistry;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.*;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.matching.*;
import com.oracle.truffle.api.source.SourceSection;

public class simplTermRegistry  implements ITermRegistry
{ 
  private final Map<String, ITermBuildFactory> builderFactories = new HashMap<String, ITermBuildFactory>();

  private final Map<String, ITermMatchPatternFactory> matcherFactories = new HashMap<String, ITermMatchPatternFactory>();

  private final Map<String, ITermBuildFactory> nativeFactories = new HashMap<String, ITermBuildFactory>();

  private final Map<String, ITermBuildFactory> nativeAdapterFactories = new HashMap<String, ITermBuildFactory>();

  public simplTermRegistry () 
  { 
    init();
  }

  private void init()
  { 
    builderFactories.put("NumV/1", new ITermBuildFactory()
                                   { 
                                     @Override public NumV_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                     { 
                                       return NumV_1_TermBuildNodeGen.create(source, children[0]);
                                     }
                                   });
    matcherFactories.put("NumV/1", new ITermMatchPatternFactory()
                                   { 
                                     @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                     { 
                                       return NumV_1_TermMatchPatternNodeGen.create(source, children[0]);
                                     }
                                   });
    builderFactories.put("BoxV/1", new ITermBuildFactory()
                                   { 
                                     @Override public BoxV_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                     { 
                                       return BoxV_1_TermBuildNodeGen.create(source, children[0]);
                                     }
                                   });
    matcherFactories.put("BoxV/1", new ITermMatchPatternFactory()
                                   { 
                                     @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                     { 
                                       return BoxV_1_TermMatchPatternNodeGen.create(source, children[0]);
                                     }
                                   });
    builderFactories.put("ClosV/3", new ITermBuildFactory()
                                    { 
                                      @Override public ClosV_3_TermBuild apply(SourceSection source, TermBuild ... children)
                                      { 
                                        return ClosV_3_TermBuildNodeGen.create(source, children[0], children[1], children[2]);
                                      }
                                    });
    matcherFactories.put("ClosV/3", new ITermMatchPatternFactory()
                                    { 
                                      @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                      { 
                                        return ClosV_3_TermMatchPatternNodeGen.create(source, children[0], children[1], children[2]);
                                      }
                                    });
    builderFactories.put("Program/1", new ITermBuildFactory()
                                      { 
                                        @Override public Program_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                        { 
                                          return Program_1_TermBuildNodeGen.create(source, children[0]);
                                        }
                                      });
    matcherFactories.put("Program/1", new ITermMatchPatternFactory()
                                      { 
                                        @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                        { 
                                          return Program_1_TermMatchPatternNodeGen.create(source, children[0]);
                                        }
                                      });
    builderFactories.put("Lit/1", new ITermBuildFactory()
                                  { 
                                    @Override public Lit_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return Lit_1_TermBuildNodeGen.create(source, children[0]);
                                    }
                                  });
    matcherFactories.put("Lit/1", new ITermMatchPatternFactory()
                                  { 
                                    @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                    { 
                                      return Lit_1_TermMatchPatternNodeGen.create(source, children[0]);
                                    }
                                  });
    builderFactories.put("Plus/2", new ITermBuildFactory()
                                   { 
                                     @Override public Plus_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                     { 
                                       return Plus_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                     }
                                   });
    matcherFactories.put("Plus/2", new ITermMatchPatternFactory()
                                   { 
                                     @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                     { 
                                       return Plus_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                     }
                                   });
    builderFactories.put("Minus/2", new ITermBuildFactory()
                                    { 
                                      @Override public Minus_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                      { 
                                        return Minus_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                      }
                                    });
    matcherFactories.put("Minus/2", new ITermMatchPatternFactory()
                                    { 
                                      @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                      { 
                                        return Minus_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                      }
                                    });
    builderFactories.put("Times/2", new ITermBuildFactory()
                                    { 
                                      @Override public Times_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                      { 
                                        return Times_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                      }
                                    });
    matcherFactories.put("Times/2", new ITermMatchPatternFactory()
                                    { 
                                      @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                      { 
                                        return Times_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                      }
                                    });
    builderFactories.put("Let/3", new ITermBuildFactory()
                                  { 
                                    @Override public Let_3_TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return Let_3_TermBuildNodeGen.create(source, children[0], children[1], children[2]);
                                    }
                                  });
    matcherFactories.put("Let/3", new ITermMatchPatternFactory()
                                  { 
                                    @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                    { 
                                      return Let_3_TermMatchPatternNodeGen.create(source, children[0], children[1], children[2]);
                                    }
                                  });
    builderFactories.put("Var/1", new ITermBuildFactory()
                                  { 
                                    @Override public Var_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return Var_1_TermBuildNodeGen.create(source, children[0]);
                                    }
                                  });
    matcherFactories.put("Var/1", new ITermMatchPatternFactory()
                                  { 
                                    @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                    { 
                                      return Var_1_TermMatchPatternNodeGen.create(source, children[0]);
                                    }
                                  });
    builderFactories.put("Box/1", new ITermBuildFactory()
                                  { 
                                    @Override public Box_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return Box_1_TermBuildNodeGen.create(source, children[0]);
                                    }
                                  });
    matcherFactories.put("Box/1", new ITermMatchPatternFactory()
                                  { 
                                    @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                    { 
                                      return Box_1_TermMatchPatternNodeGen.create(source, children[0]);
                                    }
                                  });
    builderFactories.put("Unbox/1", new ITermBuildFactory()
                                    { 
                                      @Override public Unbox_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                      { 
                                        return Unbox_1_TermBuildNodeGen.create(source, children[0]);
                                      }
                                    });
    matcherFactories.put("Unbox/1", new ITermMatchPatternFactory()
                                    { 
                                      @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                      { 
                                        return Unbox_1_TermMatchPatternNodeGen.create(source, children[0]);
                                      }
                                    });
    builderFactories.put("Setbox/2", new ITermBuildFactory()
                                     { 
                                       @Override public Setbox_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                       { 
                                         return Setbox_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                       }
                                     });
    matcherFactories.put("Setbox/2", new ITermMatchPatternFactory()
                                     { 
                                       @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                       { 
                                         return Setbox_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                       }
                                     });
    builderFactories.put("Fun/2", new ITermBuildFactory()
                                  { 
                                    @Override public Fun_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return Fun_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                    }
                                  });
    matcherFactories.put("Fun/2", new ITermMatchPatternFactory()
                                  { 
                                    @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                    { 
                                      return Fun_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                    }
                                  });
    builderFactories.put("App/2", new ITermBuildFactory()
                                  { 
                                    @Override public App_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return App_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                    }
                                  });
    matcherFactories.put("App/2", new ITermMatchPatternFactory()
                                  { 
                                    @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                    { 
                                      return App_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                    }
                                  });
    builderFactories.put("bindVar/2", new ITermBuildFactory()
                                      { 
                                        @Override public bindVar_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                        { 
                                          return bindVar_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                        }
                                      });
    matcherFactories.put("bindVar/2", new ITermMatchPatternFactory()
                                      { 
                                        @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                        { 
                                          return bindVar_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                        }
                                      });
    builderFactories.put("readVar/1", new ITermBuildFactory()
                                      { 
                                        @Override public readVar_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                        { 
                                          return readVar_1_TermBuildNodeGen.create(source, children[0]);
                                        }
                                      });
    matcherFactories.put("readVar/1", new ITermMatchPatternFactory()
                                      { 
                                        @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                        { 
                                          return readVar_1_TermMatchPatternNodeGen.create(source, children[0]);
                                        }
                                      });
    builderFactories.put("read/1", new ITermBuildFactory()
                                   { 
                                     @Override public read_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                     { 
                                       return read_1_TermBuildNodeGen.create(source, children[0]);
                                     }
                                   });
    matcherFactories.put("read/1", new ITermMatchPatternFactory()
                                   { 
                                     @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                     { 
                                       return read_1_TermMatchPatternNodeGen.create(source, children[0]);
                                     }
                                   });
    builderFactories.put("allocate/1", new ITermBuildFactory()
                                       { 
                                         @Override public allocate_1_TermBuild apply(SourceSection source, TermBuild ... children)
                                         { 
                                           return allocate_1_TermBuildNodeGen.create(source, children[0]);
                                         }
                                       });
    matcherFactories.put("allocate/1", new ITermMatchPatternFactory()
                                       { 
                                         @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                         { 
                                           return allocate_1_TermMatchPatternNodeGen.create(source, children[0]);
                                         }
                                       });
    builderFactories.put("write/2", new ITermBuildFactory()
                                    { 
                                      @Override public write_2_TermBuild apply(SourceSection source, TermBuild ... children)
                                      { 
                                        return write_2_TermBuildNodeGen.create(source, children[0], children[1]);
                                      }
                                    });
    matcherFactories.put("write/2", new ITermMatchPatternFactory()
                                    { 
                                      @Override public MatchPattern apply(SourceSection source, MatchPattern ... children)
                                      { 
                                        return write_2_TermMatchPatternNodeGen.create(source, children[0], children[1]);
                                      }
                                    });
    nativeFactories.put("parseI/1", new ITermBuildFactory()
                                    { 
                                      @Override public TermBuild apply(SourceSection source, TermBuild ... children)
                                      { 
                                        return simpl.interpreter.natives.parseI_1.create(source, children[0]);
                                      }
                                    });
    nativeFactories.put("addI/2", new ITermBuildFactory()
                                  { 
                                    @Override public TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return simpl.interpreter.natives.addI_2.create(source, children[0], children[1]);
                                    }
                                  });
    nativeFactories.put("subI/2", new ITermBuildFactory()
                                  { 
                                    @Override public TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return simpl.interpreter.natives.subI_2.create(source, children[0], children[1]);
                                    }
                                  });
    nativeFactories.put("mulI/2", new ITermBuildFactory()
                                  { 
                                    @Override public TermBuild apply(SourceSection source, TermBuild ... children)
                                    { 
                                      return simpl.interpreter.natives.mulI_2.create(source, children[0], children[1]);
                                    }
                                  });
  }

  @Override public ITerm parseProgramTerm(IStrategoTerm p)
  { 
    return IProgTerm.create(p);
  }

  @Override public ITermBuildFactory lookupBuildFactory(String constr, int arity)
  { 
    return builderFactories.get(constr + "/" + arity);
  }

  @Override public ITermMatchPatternFactory lookupMatchFactory(String constr, int arity)
  { 
    return matcherFactories.get(constr + "/" + arity);
  }

  @Override public ITermBuildFactory lookupNativeOpBuildFactory(String constr, int arity)
  { 
    return nativeFactories.get(constr + "/" + arity);
  }

  @Override public ITermBuildFactory lookupNativeTypeAdapterBuildFactory(String sort, String function, int arity)
  { 
    return nativeAdapterFactories.get(sort + "/" + function + "/" + arity);
  }
}
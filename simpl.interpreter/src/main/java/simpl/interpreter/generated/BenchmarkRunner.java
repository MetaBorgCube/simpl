package simpl.interpreter.generated;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.metaborg.meta.lang.dynsem.interpreter.nodes.rules.RuleResult;
import org.metaborg.tools.serfer.Benchmark;
import org.metaborg.tools.serfer.BenchmarkConfiguration;

public class BenchmarkRunner  
{ 
  public static void main(String[] args) throws IOException
  { 
    String file = args[0];
    Callable<RuleResult> callee = simplLanguage.getCallable(file, System.in, System.out, System.err);
    BenchmarkConfiguration benchconfig = new BenchmarkConfiguration();
    benchconfig.warmuprounds = Integer.parseInt(args[2]);
    benchconfig.repetitions = Integer.parseInt(args[3]);
    benchconfig.dataFile = new File(args[1]);
    Benchmark benchmark = new Benchmark(callee, benchconfig);
    benchmark.execute();
    benchmark.writeToFile();
  }
}
package xyz.un4ckn0wl3z.tester;

import junit.framework.*;

public class JunitTestSuiteAll {
   public static void main(String[] a) {
      // add the test's in the suite
      TestSuite suite = new TestSuite(TestJunit4.class);
      TestResult result = new TestResult();
      suite.run(result);
      System.out.println("Number of test cases = " + result.runCount());
   }
}
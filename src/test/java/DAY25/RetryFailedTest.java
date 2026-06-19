package DAY25;

import org.testng.*;
import org.testng.annotations.*;

public class RetryFailedTest implements IRetryAnalyzer {
  int count = 0;
  int maxTry = 2;

  @Override
  public boolean retry(ITestResult result) {
    if (count < maxTry) {
      count++;
      System.out.println("Retrying Test: " + count);
      return true;
    }
    return false;
  }
}

class RetryTestExample {
  @Test(retryAnalyzer = RetryFailedTest.class)
  void testRetry() {
    System.out.println("Executing Test");
    Assert.assertTrue(false);
  }
}
package DAY26;

import org.testng.annotations.Test;

public class ParallelTest {

  @Test
  @Deprecated
  public void chromeTest() {
    System.out.println("Chrome: " + Thread.currentThread().getId());
  }

  @Test
  @Deprecated
  public void firefoxTest() {
    System.out.println("Firefox: " + Thread.currentThread().getId());
  }
}

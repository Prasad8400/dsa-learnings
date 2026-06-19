package seleniumPractice;

import org.testng.annotations.*;

public class TestNGLifecycleAnnotation {

  /*
   * @BeforeMethod -> before each test method
   * 
   * @BeforeClass -> before each Java class
   * 
   * @BeforeTest -> before XML test block
   * 
   * @BeforeSuite -> before whole framework suite
   */
  @Test
  public void test1() { // Test Case 1 Contains the actual test case logic
    System.out.println("Test Case 1");
  }

  @Test
  public void test2() { // Test Case 2 Contains the actual test case logic
    System.out.println("Test Case 2");
  }

  @BeforeMethod
  public void beforeMethod() { // Executes before every @Test method
    System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() { // Runs after every @Test method
    System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() { // Runs once before the first @Test method in the current class
    System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() { // Executes once after all test methods in the current class have run
    System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() { // Executes before any test methods defined inside the <test> tag in testng.xml
    System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() { // Runs after all test methods inside the <test> tag complete execution
    System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() { // Runs once before all tests in the test suite are executed
    System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() { // Executes once after all tests in the suite have finished
    System.out.println("After Suite");
  }
}

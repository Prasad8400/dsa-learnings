package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

class LaunchDriver {
  WebDriver driver;

  public void launchBrowser() {
    driver = new FirefoxDriver();
    driver.get("https://the-internet.herokuapp.com/infinite_scroll");
    driver.manage().window().maximize();
  }

  public void closeBrowser() {
    driver.quit();
  }
}

class Scroll extends LaunchDriver {

  // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  public void scrollPage() {
    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3")));
    // type casting Because driver itself doesn't directly expose executeScript()
    JavascriptExecutor js = (JavascriptExecutor) driver;
    for (int i = 0; i < 3; i++) {
      js.executeScript("window.scrollBy(0,500)"); // New for me checked and typed from google
    }
  }
}

/*
 * |------------------ | ------------------------|
 * | Type------------- | Used For ---------------|
 * | arguments[0]------| specific element scroll |
 * | window.scrollBy() | whole page scroll ------|
 * | ----------------- | ------------------------|
 */
public class JavaScriptExecutorTest {
  @Test
  public void test() {
    Scroll scroll = new Scroll();
    try {
      scroll.launchBrowser();
      scroll.scrollPage();
      System.out.println("Scrolled Successfully");

    } finally {
      scroll.closeBrowser();
    }
  }
}

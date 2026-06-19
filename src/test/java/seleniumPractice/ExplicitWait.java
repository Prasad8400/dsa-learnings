package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
  /*
   * Explicit wait is preferred over Thread.sleep() because it waits dynamically
   * only until a specific condition is satisfied, improving execution speed and
   * reducing flaky test failures.
   */
  @Test
  public void explicitWaitTest() {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/dynamic_loading");

    driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
    driver.findElement(By.xpath("//*[@id='start']/button")).click();

    // Implicit wait is for golbally for all elements
    // Explicit is for perticular elements
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
    System.out.println(driver.findElement(By.id("finish")).getText());

    driver.quit();
  }
}

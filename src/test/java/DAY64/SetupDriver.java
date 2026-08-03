package DAY64;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupDriver {

  static WebDriver driver;

  public static void driverSetUp(String url, String header) {
    try {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(url);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(header)));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void driverQuit() {
    if (driver != null) {
      driver.quit();
    }
  }

}

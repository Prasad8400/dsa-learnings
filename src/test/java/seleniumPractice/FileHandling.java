package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FileHandling {
  WebDriver driver;

  /*
   * Selenium cannot directly handle OS-level windows/popups.
   * Instead we use sendKeys(filePath) on input type=file elements.
   */
  @Test
  public void fileHandlingWithSelenium() {
    try {
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/upload");
      System.out.println(driver.getTitle());

      String filePath = "C:\\Users\\PrasadSutar\\Downloads\\testdoc.txt";
      driver.findElement(By.name("file")).sendKeys(filePath);
      driver.findElement(By.id("file-submit")).click();

      String success = driver.findElement(By.id("uploaded-files")).getText();
      System.out.println(success);
    } finally {
      if (driver != null) {
        driver.quit();
      }
    }
  }
}

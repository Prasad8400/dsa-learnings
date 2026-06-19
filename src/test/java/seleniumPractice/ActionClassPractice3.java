package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionClassPractice3 {
  static WebDriver driver;
  Actions action;
  WebDriverWait wait;

  @Test
  void actionsKeys() throws Exception {
    try {
      driver = new ChromeDriver();
      driver.get("https://demoqa.com/text-box");
      driver.manage().window().maximize();
      wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      action = new Actions(driver);

      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userForm")));
      WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
      WebElement currentAddress = driver.findElement(By.id("currentAddress"));

      fullName.sendKeys("abc");
      action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();

      currentAddress.click();
      action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    } finally {
      driver.quit();
    }
  }

}

package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class XmlSuiteTest {

  WebDriver driver;
  WebDriverWait wait;

  // Locators
  By usernameField = By.id("username");
  By passwordField = By.id("password");
  By loginButton = By.xpath("//button[@type='submit']");
  By flashMessage = By.id("flash");

  /*
   * Runs BEFORE every test method
   */
  @BeforeMethod
  void setup() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login");

    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  }

  /*
   * Smoke Test
   */
  @Test(groups = "smoke")
  void validLoginTest() {

    wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));

    driver.findElement(usernameField).sendKeys("tomsmith");
    driver.findElement(passwordField).sendKeys("SuperSecretPassword!");
    driver.findElement(loginButton).click();

    String successMsg = driver.findElement(flashMessage).getText();

    Assert.assertTrue(successMsg.contains("You logged into a secure area!"));

    System.out.println("Valid Login Passed");
  }

  /*
   * Regression Test
   */
  @Test(groups = "regression")
  void invalidLoginTest() {

    wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));

    driver.findElement(usernameField).sendKeys("tomsmith");
    driver.findElement(passwordField).sendKeys("WrongPassword");
    driver.findElement(loginButton).click();

    String errorMsg = driver.findElement(flashMessage).getText();

    Assert.assertTrue(errorMsg.contains("Your password is invalid!"));

    System.out.println("Invalid Login Passed");
  }

  /*
   * Runs AFTER every test method
   */
  @AfterMethod
  void teardown() {

    if (driver != null) {
      driver.quit();
    }
  }
}

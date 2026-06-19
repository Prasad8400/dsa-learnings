package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class BeforeAfterMethod {

  static WebDriver driver;
  static WebDriverWait wait;

  // Locators
  By usernameField = By.id("username");
  By passwordField = By.id("password");
  By loginButton = By.xpath("//button[@type='submit']");
  By logoutButton = By.xpath("//a[contains(@href,'logout')]");

  // Methods
  public void enterUsername(String username) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
    driver.findElement(usernameField).sendKeys(username);
  }

  public void enterPassword(String password) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
    driver.findElement(passwordField).sendKeys(password);
  }

  public void clickLogin() {
    wait.until(ExpectedConditions.elementToBeClickable(loginButton));
    driver.findElement(loginButton).click();
  }

  public boolean isLogoutDisplayed() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(logoutButton));
    return driver.findElement(logoutButton).isDisplayed();
  }

  public void clickLogout() {
    wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
    driver.findElement(logoutButton).click();
  }

  @BeforeClass
  void setup() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/login");
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @DataProvider(name = "login")
  public Object[][] credentials() {
    return new Object[][] {
        { "tomsmith", "SuperSecretPassword!" },
        { "tomsmith", "SuperSecretPassword!1" }
    };
  }

  @Test(dataProvider = "login")
  void login(String uname, String pass) {
    BeforeAfterMethod page = new BeforeAfterMethod();
    page.enterUsername(uname);
    page.enterPassword(pass);
    page.clickLogin();
    page.isLogoutDisplayed();
    page.clickLogout();
  }

  @AfterClass
  void close() {
    driver.quit();
  }

}

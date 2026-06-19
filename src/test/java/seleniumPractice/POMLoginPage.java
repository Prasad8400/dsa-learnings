package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//DriverFactory is only used for driver things handling
class DriverFactory2 {
  WebDriver driver;

  public void launchBrowser() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  public void quitBrowser() {
    driver.quit();
  }
}

// LoginPage handles and stores all webelements reletae dto login page
class LoginPage extends DriverFactory2 {
  public void enter_UserName(String uname) {
    driver.findElement(By.id("username")).sendKeys(uname);
  }

  public void enter_Password(String pass) {
    driver.findElement(By.id("password")).sendKeys(pass);
  }

  public void clickOn_Submit() {
    driver.findElement(By.id("submit")).click();
  }
}

public class POMLoginPage {
  @Test
  public void LoginSteps() {
    LoginPage login = new LoginPage();
    login.launchBrowser();
    login.enter_UserName("student");
    login.enter_Password("Password123");
    login.clickOn_Submit();
    login.quitBrowser();
  }
}

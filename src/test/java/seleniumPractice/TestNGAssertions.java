package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

class DriverFactorys {

  static WebDriver driver;

  void setups() {
    driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");
    driver.manage().window().maximize();
  }

  void teardowns() {
    driver.quit();
  }
}

class LoginPagex extends DriverFactorys {

  void enter_Username(String str) {
    driver.findElement(By.id("username")).sendKeys(str);
  }

  void enter_Password(String str) {
    driver.findElement(By.id("password")).sendKeys(str);
  }

  void click_Login() {
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  void verify_SuccessMessage(String str) {
    Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains(str));
  }

  void click_Logout() {
    driver.findElement(By.xpath("//i[text()=' Logout']")).click();
  }
}

public class TestNGAssertions {
  LoginPagex page = new LoginPagex();

  @Test(groups = "smoke", priority = 1)
  void login() {

    page.setups();
    page.enter_Username("tomsmith");
    page.enter_Password("SuperSecretPassword!");
    page.click_Login();

  }

  @Test(groups = "regression", priority = 2)
  void invalidLogin() {

    page.setups();
    page.enter_Username("tomsmith");
    page.enter_Password("SuperSecretPassword!1");
    page.click_Login();

  }

  @Test(dependsOnMethods = "login")
  void verify_HomePage() {
    page.verify_SuccessMessage("You logged into a secure area!");
  }

  @Test(dependsOnMethods = "verify_HomePage")
  void logout() {
    page.click_Logout();
    page.teardowns();
  }
}
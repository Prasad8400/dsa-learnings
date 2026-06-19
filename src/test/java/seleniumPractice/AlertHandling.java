package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

class AlertHandling {

  /*
   * JavaScript alerts are browser-level popups, so Selenium cannot directly
   * inspect them using normal locators.
   * We must switch driver focus using switchTo().alert() before performing
   * actions like accept(), dismiss(), or getText().
   */

  public static void main(String[] args) {

    System.out.println("\n---- Starting selenium test----");
    WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();

    driver.findElement(By.linkText("JavaScript Alerts")).click();
    WebElement acceptAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    WebElement acceptDismiss = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));

    acceptAlert.click();
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
    System.out.println(driver.findElement(By.cssSelector("p#result")).getText());

    acceptDismiss.click();
    alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.dismiss();
    System.out.println(driver.findElement(By.cssSelector("p#result")).getText());

    driver.quit();
  }
}
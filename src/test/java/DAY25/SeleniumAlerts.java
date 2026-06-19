package DAY25;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumAlerts {
  WebDriver driver;
  WebDriverWait wait;

  @BeforeTest
  void setup() {
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='alertButton']")));

  }

  @Test
  void alertAccept() {
    WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
    alertButton.click();

    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
  }

  @Test
  void dismissAccept() {
    WebElement confirmButton = driver.findElement(By.id("confirmButton"));
    confirmButton.click();

    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.dismiss();

    String confirmResult = driver.findElement(By.id("confirmResult")).getText();
    System.out.println(confirmResult);
  }

  @Test
  void sendtxtToAlert() {
    WebElement promptButton = driver.findElement(By.id("promtButton"));
    promptButton.click();
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("iamok");
    alert.accept();
    String promptResult = driver.findElement(By.id("promptResult")).getText();
    System.out.println(promptResult);
    Assert.assertTrue(promptResult.contains("iamok"));
  }

  @AfterTest
  void teardown() {
    driver.quit();
  }
}

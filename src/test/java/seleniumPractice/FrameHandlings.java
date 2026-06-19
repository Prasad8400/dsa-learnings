package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrameHandlings {
  WebDriver driver;
  WebDriverWait wait;

  @Test
  void nestedframe() {
    try {
      // Setup
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/nested_frames");
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame-top"));

      // Nested Frames
      // driver.switchTo().frame("frame-top");
      driver.switchTo().frame("frame-left");
      System.out.println(driver.findElement(By.tagName("body")).getText());
    } finally {
      // teardown
      driver.quit();
    }
  }

  @Test
  void frame() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://the-internet.herokuapp.com/frames");
    driver.findElement(By.linkText("iFrame")).click();

    driver.switchTo().frame("mce_0_ifr");
    WebElement el = driver.findElement(By.id("tinymce"));
    el.clear();
    el.sendKeys("Hello Prasad");
    // driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();
    driver.quit();

  }
}

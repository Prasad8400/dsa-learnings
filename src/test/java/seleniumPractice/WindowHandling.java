package seleniumPractice;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
  @Test
  // public static void main(String[] args) {
  public void windowsHandlingTest() {

    System.out.println("Starting Selenium Test...");
    WebDriver driver = new ChromeDriver();

    System.out.println("Maximizing Window...");
    driver.manage().window().maximize();

    System.out.println("Opening URL...");
    driver.get("https://the-internet.herokuapp.com/windows");
    System.out.println(driver.getTitle());

    String Parent = driver.getWindowHandle();
    System.out.println(Parent + ":" + driver.getTitle());
    driver.findElement(By.linkText("Click Here")).click();

    Set<String> windows = driver.getWindowHandles();
    for (String window : windows) {
      if (!window.equals(Parent)) {
        driver.switchTo().window(window);
        System.out.println(driver.getTitle());
      }
    }
    driver.switchTo().window(Parent);
    System.out.println("Quitting Driver!!");
    driver.quit();
  }
}

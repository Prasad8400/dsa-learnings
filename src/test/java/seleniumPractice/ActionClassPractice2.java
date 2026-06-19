package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

class Driver {
  WebDriver driver;
  Actions act;

  public void browser() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/buttons");
  }

  public void close() {
    driver.quit();
  }
}

class Buttons extends Driver {

  public void doubleClickMe() {
    WebElement el = driver.findElement(By.id("doubleClickBtn"));
    act = new Actions(driver);
    act.doubleClick(el).perform();
  }

  public void doubleClickMessage() {
    String el = driver.findElement(By.id("doubleClickMessage")).getText();
    System.out.println(el);
  }

  public void rightClickMe() {
    WebElement el = driver.findElement(By.id("rightClickBtn"));
    act = new Actions(driver);
    act.contextClick(el).perform();
  }

  public void rightClickMessage() {
    String el = driver.findElement(By.id("rightClickMessage")).getText();
    System.out.println(el);
  }
}

public class ActionClassPractice2 {
  @Test
  public void bttnTest() {
    Buttons bttn = new Buttons();
    try {
      bttn.browser();
      bttn.doubleClickMe();
      bttn.doubleClickMessage();
      bttn.rightClickMe();
      bttn.rightClickMessage();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Execution Completed");
      bttn.close();
    }
  }
}

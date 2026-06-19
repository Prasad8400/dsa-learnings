package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

class DriverManager {
  WebDriver driver;

  void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/dropdown");
  }

  void tearDown() {
    driver.quit();
  }
}

class DropdownHandlingPage extends DriverManager {
  Select dropdown;

  WebElement dropdown() {
    return driver.findElement(By.id("dropdown"));
  }

  void selectDropdownByVisibleText(String text) {
    dropdown = new Select(dropdown());
    dropdown.selectByVisibleText(text);
  }

  void printSelectedOption() {
    String selected = driver.findElement(By.xpath("//option[@selected='selected']")).getText();
    System.out.println(selected);
  }

  void selectDropdownByIndex(int index) {
    dropdown = new Select(dropdown());
    dropdown.selectByIndex(index);
  }

  void selectDropdownByValue(String value) {
    dropdown = new Select(dropdown());
    dropdown.selectByValue(value);
  }
}

public class DropdownHandling {
  @Test
  void dropdownTest() {
    DropdownHandlingPage page = new DropdownHandlingPage();
    try {
      page.setUp();
      page.selectDropdownByVisibleText("Option 1");
      System.out.print("Select by visible Text: ");
      page.printSelectedOption();

      page.selectDropdownByIndex(2);
      System.out.print("Select by Index: ");
      page.printSelectedOption();

      page.selectDropdownByValue("1");
      System.out.print("Select by Value: ");
      page.printSelectedOption();

    } finally {
      page.tearDown();
    }
  }
}

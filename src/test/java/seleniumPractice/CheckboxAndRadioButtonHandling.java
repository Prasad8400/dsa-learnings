package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxAndRadioButtonHandling {
  WebDriver driver;

  void setUp() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/radio-button");
    System.out.println(driver.getTitle());
  }

  void tearDown() {
    driver.quit();
  }

  void clickOn_RadioButton(String bttn) {
    WebElement radio = driver.findElement(By.id(bttn.toLowerCase() + "Radio"));
    radio.click();
  }

  void print_TextSuccess() {
    String success = driver.findElement(By.tagName("p")).getText();
    System.out.println(success);
  }

  @Test
  void testRadionButton() {
    try {
      setUp();
      clickOn_RadioButton("Yes");
      print_TextSuccess();
      clickOn_RadioButton("Impressive");
      print_TextSuccess();
    } finally {
      tearDown();
    }
  }
}

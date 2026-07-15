package DAY57;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksInterview {

  /*
   * I used findElements with tagName("a") because all links are represented by
   * anchor tags.
   * Then I iterated through the List<WebElement>, checked whether link text is
   * not empty and element is displayed, printed the link text, and finally
   * printed the total link count.
   */
  static WebDriver driver;

  public static void main(String[] args) {
    try {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      String url = "https://automationpanda.com/tag/selenium/";
      driver.get(url);

      List<WebElement> aTag = driver.findElements(By.tagName("a"));
      for (WebElement el : aTag) {
        String linktext = el.getText().trim();
        if (!el.getText().isEmpty() && el.isDisplayed())
          System.out.println(linktext);

      }
      System.out.println(aTag.size());
    } finally {
      if (driver != null)
        driver.quit();
    }
  }

}

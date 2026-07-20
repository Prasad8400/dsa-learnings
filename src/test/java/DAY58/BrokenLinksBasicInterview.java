package DAY58;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksBasicInterview {
  /*
   * I captured all links using findElements with tagName("a").
   * Then I fetched href using getAttribute("href").
   * If href is null or empty, I counted it as invalid.
   * If href is present, I printed the URL.
   * For actual broken link validation, we need to hit the URL and check HTTP
   * response status code.
   */
  static WebDriver driver;

  public static void main(String[] args) {
    try {
      driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/");
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      int countBroken = 0;

      List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
      for (WebElement link : list) {
        String href = link.getAttribute("href");
        if (href != null && !href.trim().isEmpty()) {// Always check null first to avoid null pointer exception
          href = href.trim();
          System.out.println(href);
        } else {
          countBroken++;
        }
      }
      System.out.println("Broken links: " + countBroken);
    } finally {
      driver.quit();
    }
  }

}

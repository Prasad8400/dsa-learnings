package DAY60;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxSelectionInterview {

  static WebDriver driver;

  public static void main(String[] args) {
    /*
     * 1. Open a webpage with checkboxes
     * 2. Get all checkboxes
     * 3. Select only unchecked checkboxes
     * 4. Print total checkbox count
     * 5. Print how many checkboxes were selected by your script
     */
    try {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.get("https://the-internet.herokuapp.com/checkboxes");

      int count = 0;
      String xpath = "//input[@type = 'checkbox']";
      wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
      List<WebElement> checkoxes = driver.findElements(By.xpath(xpath));

      for (int i = 0; i < checkoxes.size(); i++) {
        if (!checkoxes.get(i).isSelected()) {
          checkoxes.get(i).click();
          count++;
          System.out.println("Selected only unchecked checkboxe: " + checkoxes.get(i).getText());
        }
      }

      System.out.println("Total checkbox count: " + checkoxes.size());
      System.out.println("Checkboxes were selected by your script: " + count);

    } finally {
      if (driver != null)
        driver.quit();
    }

  }

}

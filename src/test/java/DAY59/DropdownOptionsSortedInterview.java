package DAY59;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownOptionsSortedInterview {
  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();

    try {
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/dropdown");

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      WebElement dropdownElement = wait.until(
          ExpectedConditions.presenceOfElementLocated(By.id("dropdown")));

      Select dropdown = new Select(dropdownElement);

      List<WebElement> options = dropdown.getOptions();

      List<String> originalOptions = new ArrayList<>();
      List<String> sortedOptions = new ArrayList<>();

      for (WebElement option : options) {
        String text = option.getText().trim();

        if (!text.isEmpty()) {
          originalOptions.add(text);
          sortedOptions.add(text);
        }
      }

      Collections.sort(sortedOptions);

      if (originalOptions.equals(sortedOptions)) {
        System.out.println("Dropdown options are sorted");
      } else {
        System.out.println("Dropdown options are not sorted");
      }

      System.out.println("Original: " + originalOptions);
      System.out.println("Sorted: " + sortedOptions);

    } finally {
      driver.quit();
    }
  }
}
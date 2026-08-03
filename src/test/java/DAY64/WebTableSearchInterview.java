package DAY64;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableSearchInterview extends SetupDriver {
  /*
   * Open: https://the-internet.herokuapp.com/tables
   * There are two tables.
   * Search for the user: Smith
   * If found, print the entire row.
   * Expected Output (example) : Smith | John | jsmith@gmail.com | $50.00 |
   * http://www.jsmith.com
   * If not found: User Not Found
   */
  public static void main(String[] args) {
    try {

      driverSetUp("https://the-internet.herokuapp.com/tables", "table");
      List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
      boolean found = false;

      for (WebElement row : rows) {
        String lastName = row.findElement(By.xpath("./td[1]")).getText();
        String rowWithSmith = row.getText();

        if (lastName.contains("Smith")) {
          rowWithSmith = rowWithSmith.replace(" ", " | ");
          System.out.println(rowWithSmith);
          found = true;
          break;
        }
      }

      if (!found) {
        System.out.println("User Not Found");
      }

    } finally {
      driverQuit();
    }
  }
}

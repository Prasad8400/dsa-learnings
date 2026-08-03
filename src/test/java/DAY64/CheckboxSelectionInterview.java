package DAY64;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxSelectionInterview extends SetupDriver {
  /*
   * Launch Chrome.
   * Open: https://the-internet.herokuapp.com/checkboxes
   * Wait until both checkboxes are visible.
   * Select only unchecked checkboxes.
   * Print:
   * Total Checkboxes : X
   * Selected by Script : Y
   * Finally, print the final state of every checkbox:
   * Example:
   * Checkbox 1 : Selected
   * Checkbox 2 : Selected
   * Close browser in finally.
   */
  public static void main(String[] args) {
    try {
      driverSetUp("https://the-internet.herokuapp.com/checkboxes", "h3");
      List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
      System.out.println("Total Checkboxes : " + checkboxes.size());
      int checked = 0;
      for (WebElement checkbox : checkboxes) {
        if (!checkbox.isSelected()) {
          checkbox.click();
          checked++;
        }
      }
      System.out.println("Selected by Script : " + checked);

      for (int i = 0; i < checkboxes.size(); i++) {
        System.out
            .println("Checkbox " + (i + 1) + " : " + (checkboxes.get(i).isSelected() ? "Selected" : "Not Selected"));
      }
    } finally {
      driverQuit();
    }
  }

}

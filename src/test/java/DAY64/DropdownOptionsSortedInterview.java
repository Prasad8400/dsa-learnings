package DAY64;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptionsSortedInterview extends SetupDriver {
  public static void main(String[] args) {
    try {
      driverSetUp("https://the-internet.herokuapp.com/dropdown", "select");
      Select dropdown = new Select(driver.findElement(By.id("dropdown")));
      List<WebElement> options = dropdown.getOptions();

      List<String> unsortedOptions = new ArrayList<>();
      List<String> sortedOptions = new ArrayList<>();

      for (int i = 0; i < options.size(); i++) {
        String option = options.get(i).getText();
        if (!option.equals("Please select an option")) {
          unsortedOptions.add(option);
          sortedOptions.add(option);
        }
      }
      Collections.sort(sortedOptions);

      if (sortedOptions.equals(unsortedOptions)) {
        System.out.println("Dropdown is Sorted");
      } else {
        System.out.println("Dropdown is NOT Sorted");
      }
      System.out.println("Sorted Option: " + sortedOptions);
      System.out.println("Unsorted Option: " + unsortedOptions);

    } finally {
      driverQuit();
    }
  }

}

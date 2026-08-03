package DAY64;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintAllLinksInterview extends SetupDriver {
  /*
   * Launch browser.
   * Open : https://the-internet.herokuapp.com/
   * Wait until page loads.
   * Fetch all <a> tags.
   * Ignore links having: 1]null href 2]empty href
   * Print
   * Link Text : ...
   * Href : ...
   * Example
   * Link Text : Form Authentication
   * Href : https://the-internet.herokuapp.com/login
   * Finally print
   * Total Valid Links : X
   */
  public static void main(String[] args) {
    try {
      driverSetUp("https://the-internet.herokuapp.com/", "a");
      List<WebElement> links = driver.findElements(By.tagName("a"));
      int nonBrokenLink = 0;
      for (WebElement link : links) {
        String href = link.getAttribute("href");
        if (href != null && !href.isEmpty()) {
          System.out.println("Link Text : " + link.getText().trim());
          System.out.println("Href : " + href.trim());
          nonBrokenLink++;
        }
      }
      System.out.println("Total Valid Links : " + nonBrokenLink);
    } finally {
      driverQuit();
    }
  }

}

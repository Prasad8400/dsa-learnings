package DAY64;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinksHTTPInterview extends SetupDriver {
  /*
   * 1. Launch browser
   * 2. Open https://the-internet.herokuapp.com/
   * 3. Get all links
   * 4. Ignore null, empty and javascript links
   * 5. Open HTTP Connection
   * 6. Get Response Code
   * 7. Print Working/Broken
   */
  public static void main(String[] args) {

    try {
      driverSetUp("https://the-internet.herokuapp.com/", "a");
      List<WebElement> links = driver.findElements(By.tagName("a"));

      for (WebElement link : links) {
        String href = link.getAttribute("href");
        // Ignore invalid links
        if (href == null || href.trim().isEmpty() || href.startsWith("javascript")) {
          continue;
        }
        try {
          URL url = new URL(href); // Convert String URL to URL Object
          HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // Open HTTP Connection
          connection.setRequestMethod("HEAD"); // We only need response headers
          connection.connect(); // Send Request
          int responseCode = connection.getResponseCode(); // Get Status Code

          System.out.println("--------------------------------");
          System.out.println("Link : " + href);
          System.out.println("Response Code : " + responseCode);
          if (responseCode >= 400) {
            System.out.println("Broken Link");
          } else {
            System.out.println("Working Link");
          }
          connection.disconnect(); // Close Connection

        } catch (Exception e) {
          System.out.println("Error checking : " + href);
        }
      }

    } finally {
      driverQuit();
    }
  }
}
package DAY55;

import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePricesSortedInterview {

  /*
   * I will capture all price elements using findElements, which returns
   * List<WebElement>. Then I will iterate through each element, get the text,
   * remove commas or currency symbols, convert it into integer using
   * Integer.parseInt, store it in a list, sort it using Collections.sort or
   * Arrays.sort, and print the sorted prices.
   */
  static WebDriver driver;

  public static void main(String[] args) {

    try {

      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(
          "https://www.amazon.in/s?k=mobiles&i=electronics&rh=n%3A1389401031%2Cp_123%3A46655&dc=&qid=1783916279&rnid=1318502031&ref=sr_nr_p_36_0_0&low-price=31600&high-price=");

      List<WebElement> el = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
      int[] prices = new int[el.size()];

      for (int i = 0; i < el.size(); i++) {
        String price = el.get(i).getText().replace(",", "");
        if (!price.isEmpty())
          prices[i] = Integer.parseInt(price);
      }

      Arrays.sort(prices);
      System.out.println(Arrays.toString(prices));

    } finally {
      if (driver != null)
        driver.quit();
    }

  }

}

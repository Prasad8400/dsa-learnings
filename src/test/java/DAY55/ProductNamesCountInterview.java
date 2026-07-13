package DAY55;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductNamesCountInterview {

  static WebDriver driver;

  public static void main(String[] args) {

    try {

      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get(
          "https://www.amazon.in/s?k=mobiles&i=electronics&rh=n%3A1389401031%2Cp_123%3A46655&dc=&qid=1783916279&rnid=1318502031&ref=sr_nr_p_36_0_0&low-price=31600&high-price=");

      List<WebElement> productNames = driver
          .findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));

      for (int i = 0; i < productNames.size(); i++) {
        String[] name = productNames.get(i).getText().trim().split("\\(");
        System.out.println(name[0].trim());
      }
      System.out.println(productNames.size());

    } finally {
      if (driver != null)
        driver.quit();
    }

  }

}

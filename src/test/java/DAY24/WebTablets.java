package DAY24;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

public class WebTablets {
  @Test
  void allEmployeeNames() {
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/webtables");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    wait.until(ExpectedConditions.presenceOfElementLocated(
        By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr/td[1]")));
    List<WebElement> firstNames = driver
        .findElements(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr/td[1]"));
    List<WebElement> age = driver
        .findElements(By.xpath("//*[@id='root']/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr/td[3]"));
    for (int i = 0; i < firstNames.size(); i++) {
      if (Integer.valueOf(age.get(i).getText()) > 30)
        System.out.println(firstNames.get(i).getText());
    }
    driver.quit();
  }
}

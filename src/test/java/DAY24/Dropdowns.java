package DAY24;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

public class Dropdowns {
  @Test
  void seleniumDropdowns() {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/select-menu");
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("oldSelectMenu")));

    WebElement oldStyleSelectMenu = driver.findElement(By.id("oldSelectMenu"));

    Select menu = new Select(oldStyleSelectMenu);
    menu.selectByVisibleText("Red");
    System.out.println(menu.getFirstSelectedOption().getText());
    menu.selectByValue("6");
    System.out.println(menu.getFirstSelectedOption().getText());
    menu.selectByIndex(3);
    System.out.println(menu.getFirstSelectedOption().getText());

    driver.quit();

  }

}

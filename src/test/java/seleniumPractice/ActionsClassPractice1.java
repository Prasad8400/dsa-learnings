package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

class DriverFactory1 {
  WebDriver driver;

  public void launch_FirefoxBrowser() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/hovers");
  }

  public void tearDown() {
    driver.quit();
  }
}

class HoversPage extends DriverFactory1 {
  Actions act;

  public void hoverOnUser() {
    WebElement el = driver.findElement(By.xpath("(//*[@alt='User Avatar'])[1]"));
    act = new Actions(driver);
    act.moveToElement(el).perform();
  }

  public void userNameTxt() {
    String uname = driver.findElement(By.xpath("(//h5)[1]")).getText();
    System.out.println(uname);
  }
}

public class ActionsClassPractice1 {
  @Test
  public void hoversTest() {
    HoversPage page = new HoversPage();
    page.launch_FirefoxBrowser();
    page.hoverOnUser();
    page.userNameTxt();
    page.tearDown();
  }
}

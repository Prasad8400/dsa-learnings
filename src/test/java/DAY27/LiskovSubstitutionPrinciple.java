package DAY27;

interface Browsers {
  void launch();

  void quit();
}

class ChromeBrowsers implements Browsers {

  @Override
  public void launch() {
    System.out.println("Launching Chrome browser");
    // driver = new ChromeDriver();
  }

  @Override
  public void quit() {
    System.out.println("Closing Chrome browser");
  }
}

class FirefoxBrowsers implements Browsers {

  @Override
  public void launch() {
    System.out.println("Launching Firefox browser");
    // driver = new FirefoxDriver();
  }

  @Override
  public void quit() {
    System.out.println("Closing Firefox browser");
  }
}

class EdgeBrowsers implements Browsers {

  @Override
  public void launch() {
    System.out.println("Launching Edge browser");
  }

  @Override
  public void quit() {
    System.out.println("Closing Edge browser");
  }
}

public class LiskovSubstitutionPrinciple {
  /*
   * instead of implementing flyable to penguin we create new method inside it as
   * swim
   */
  public static void main(String[] args) {
    Browsers browsers = new ChromeBrowsers();
    browsers.launch();
    browsers.quit();

    browsers = new FirefoxBrowsers();
    browsers.launch();
    browsers.quit();
  }
}

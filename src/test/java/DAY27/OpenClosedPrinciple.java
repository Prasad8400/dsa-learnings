package DAY27;

/*
Software entities should be OPEN for extension
but CLOSED for modification.
 */
interface Browser {
  void launch();
}

class ChromeBrowser implements Browser {

  public void launch() {
    System.out.println("Launching Chrome");
  }
}

class FirefoxBrowser implements Browser {

  public void launch() {
    System.out.println("Launching Firefox");
  }
}

/*
 * Tomorrow Edge Comes
 * Just create:
 */
class EdgeBrowser implements Browser {
  public void launch() {
    System.out.println("Launching Edge");
  }
}

public class OpenClosedPrinciple {
  /*
   * 🏆 Interview Answer
   * 
   * What is Open Closed Principle?
   * A class should be open for extension but closed for modification.
   * New functionality should be added by extending existing code rather than
   * modifying already tested code.
   */
  public static void main(String[] args) {
    Browser browser = new ChromeBrowser();
    browser.launch();
    Browser browser1 = new EdgeBrowser();
    browser1.launch();
  }
}

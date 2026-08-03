package DAY64;

public class LoginPageTitleVerificationInterview extends SetupDriver {

  public static void main(String[] args) {
    try {
      driverSetUp("https://the-internet.herokuapp.com/login", "h2");

      if (driver.getTitle().equals("The Internet")) {
        System.out.println("Title Verified");
      } else {
        System.out.println("Title Mismatch");
      }
    } finally {
      driverQuit();
    }
  }

}

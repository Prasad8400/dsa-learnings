package DAY25;

import org.testng.annotations.*;

public class TestNGParameters {
  @Parameters({ "username", "password" })
  @Test
  void loginUsingXML(String uname, String pass) {
    System.out.println("Username: " + uname);
    System.out.println("Password: " + pass);
  }
}

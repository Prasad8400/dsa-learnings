package javaPractice;

/*
Interface
CAN-DO relationship

Phone CAN:

take photos
play music
make calls

*/
interface Camera {
  public void camera();
}

interface MusicPlayer {
  public void musicPlayer();
}

interface Calling {
  public void calling();
}

// multiple inheritance through interfaces
/*
 * An interface is used to achieve abstraction and multiple inheritance in Java.
 * 
 * It represents capabilities or contracts that a class must implement.
 * 
 * For example, a smartphone can implement Camera, MusicPlayer, and Calling
 * interfaces because these are capabilities/features.
 * 
 * In Selenium, WebDriver is an interface implemented by ChromeDriver,
 * FirefoxDriver, etc.
 */
class OnePlus implements Camera, MusicPlayer, Calling {
  public void camera() {
    System.out.println("Click Photo");
  }

  public void musicPlayer() {
    System.out.println("Play Music");
  }

  public void calling() {
    System.out.println("Calling Number");
  }
}

class Interface {
  public static void main(String[] args) {
    OnePlus phone = new OnePlus();
    phone.camera();
    phone.musicPlayer();
    phone.calling();
  }
}
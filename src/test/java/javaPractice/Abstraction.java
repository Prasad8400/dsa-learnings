package javaPractice;

abstract class AbstractAnimal { // Declare abstract class

  /*
   * Abstraction means hiding implementation details and showing only essential
   * functionality to the user.
   * 
   * For example, when we drive a car, we use steering, brake, and accelerator
   * without knowing the internal engine implementation.
   * 
   * In Java, abstraction can be achieved using abstract classes and interfaces.
   * 
   * Abstract classes can contain both abstract and implemented methods, while
   * interfaces mainly define contracts/capabilities.
   */
  public abstract void animal(); // Declare abstract method

  public void sleep() { // abstract class can have regular methods
    System.out.println("Zzzz");
  }
}

/*
 * Inheritance allows one class to acquire properties and behaviors of another
 * class.
 * 
 * It helps in code reusability and maintaining hierarchical relationships.
 * 
 * For example, Dog extends Animal. Dog inherits common behavior from Animal and
 * can also have its own specific behavior.
 * 
 * In Selenium, ChromeDriver inherits behavior from RemoteWebDriver.
 * 
 */
class AbstractDog extends AbstractAnimal { // Extending class to abstract class : Inheritance
  public void animal() { // Mandatory to declare abstract method when class extends abstract class
    System.out.println("Dog Barks : Bhow bhow");
  }
}

class Abstraction {
  public static void main(String[] args) {
    AbstractDog dog = new AbstractDog();
    dog.animal(); // Need to override this method in child class
    dog.sleep(); // and this is inherited from parent due to inheritence
  }
}

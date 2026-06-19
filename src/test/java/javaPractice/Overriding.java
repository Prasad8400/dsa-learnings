package javaPractice;

class Animal {
  public void sound() {
    System.out.println("Animal Sound");
  }
}

/*
 * Method overriding happens when a child class provides its own implementation
 * of a parent class method.
 * 
 * Method name and parameters remain same.
 * 
 * It is an example of runtime polymorphism.
 * 
 * Example:
 * Dog overrides sound() method from Animal class.
 * 
 * At runtime, JVM decides which method implementation to execute.
 */
class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Bark");
  }
}

/*
 * Overriding used To provide specific implementation in child class.
 * Static method cannot be Overrided its belong to class not a Object
 * Child Overrides Parent method
 */
public class Overriding {
  public static void main(String[] args) {
    // Animal animal = new Dog(); <-- Loved by Interviewer
    Dog dog = new Dog();
    dog.sound();
  }
}

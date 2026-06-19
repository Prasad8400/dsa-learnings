package javaPractice;

class Overloading {
  /*
   * Polymorphism means one object or method taking multiple forms.
   * 
   * There are two types:
   * 
   * 1. Compile-time polymorphism → Method Overloading
   * 2. Runtime polymorphism → Method Overriding
   * 
   * Example:
   * WebDriver driver = new ChromeDriver();
   * 
   * Reference type is WebDriver, but actual object is ChromeDriver. This is
   * runtime polymorphism.
   */

  /*
   * Method overloading means having multiple methods with the same name but
   * different parameters.
   * 
   * It is an example of compile-time polymorphism.
   * 
   * Example:
   * add(int a, int b)
   * add(int a, int b, int c)
   * 
   * The compiler decides which method to call based on arguments.
   */
  public static int addition(int a, int b) {
    return a + b;
  }

  public static int addition(int a, int b, int c) {
    return a + b + c;
  }

  /*
   * |---------------------------|-------------|
   * | Type | Example |
   * |---------------------------|-------------|
   * | Compile-time polymorphism | Overloading |
   * | Runtime polymorphism | Overriding |
   * |---------------------------|-------------|
   * Same method name different parameters
   */
  public static void main(String[] args) {
    System.out.println(addition(1, 2));
    System.out.println(addition(1, 2, 3));
  }
}
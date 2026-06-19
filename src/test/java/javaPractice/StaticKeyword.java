package javaPractice;

public class StaticKeyword {
  /*
   * 🧠 What is static?
   * Belongs to class, not object.
   * Meaning: shared among all objects
   */

  /*
   * 🌟 Common Interview Question
   * Why main method static?
   * Because JVM should call: main() WITHOUT creating object.
   */

  static String company;
  /*
   * main() is entry point for program execution, but static initialization
   * happens during class loading before main() executes.
   */
  static {
    company = "Google";
    System.out.println("Static block executed");
  }

  // Can call directly:
  static void staticMethod() {
    System.out.println("This is Static Method!!");
  }

  public static void main(String[] args) {

    /*
     * 🌟 1️⃣ static Variable
     * Only: one copy created shared by all objects.
     */
    System.out.println(company); // Every employee shares: same company value

    /*
     * 🧠 2️⃣ static Method
     * Can call: without creating object
     */
    staticMethod();
    // Math.max(10, 20); // No object needed.

    /*
     * 🧠 3️⃣ static Block
     * Executes: only once when class loads before main method.
     */
    System.out.println("This is Static Block: " + company);
  }

  /*
   * | static Type | Purpose |
   * | --------------- | -------------------------------|
   * | static variable | shared value |
   * | static method | call without object |
   * | static block | executes once during class loading |
   */
}

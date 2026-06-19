package javaPractice;

/*
 * 🎯 final vs finally vs finalize
 * 
 * 🧠 1️⃣ final Used to: restrict modification
 * Can be used with: 1) variable 2) method 3) class
 */

/*
 * 🌟 final Class Cannot be: inherited will throw error
 */
final class FinalClass {
  final static void finalMethod() {
    System.out.println("This is a final method within final class.");
  }
}

public class FinalVsFinallyVsFinalize {
  final static void finalMethod() {
    System.out.println(" This is a final method.");
  }

  public static void main(String[] args) {

    /*
     * 🌟 final Variable Cannot changes later will throw error
     */
    final int age = 26; // age = 30;
    System.out.print(age);

    /*
     * 🌟 final Method Cannot be overridden will throw error
     */
    finalMethod(); // @Override

    /*
     * 🧠 2️⃣ finally Used with: try-catch
     * Always executes: whether exception occurs or not
     */

    try {
      int div = 10 / 0;
      System.out.println(div);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero:" + e);
    } finally {
      System.out.println("Execution finished!!");
    }

    /*
     * 🧠 3️⃣ finalize()
     * Old garbage collection related method.
     * Called: before object destroyed by Garbage Collector
     * finalize() is deprecated in modern Java
     */
  }
}

// class Parent extends FinalClass {

// final void show() {
// System.out.println("Parent Method");
// }
// }

// class Child extends Parent {

// @Override // Cannot override the final method from Parent
// void show() {
// System.out.println("Child Method");
// }
// }

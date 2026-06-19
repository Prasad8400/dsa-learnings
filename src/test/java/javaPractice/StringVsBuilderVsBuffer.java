package javaPractice;

public class StringVsBuilderVsBuffer {
  /*
   * String is immutable, thread-safe, and slow for modifications.
   * StringBuilder is mutable, not thread-safe, and fastest for modifications.
   * StringBuffer is mutable, thread-safe, and slower than StringBuilder.
   * 
   * Why String immutable? Cannot modify after creation
   * Why StringBuilder faster? Mutable, no repeated object creation
   * Difference Builder vs Buffer? Buffer thread-safe, Builder faster
   */
  public static void main(String[] args) {

    /*
     * 🧠 1️⃣ String
     * Strings are: immutable
     * Meaning: cannot change after creation
     * 🎯 Problem With String If many modifications happen:
     * 1. memory waste
     * 2. slower performance
     */
    String s = "Hello"; // String cannot be modified after creation.
    s.concat(" World"); // s = s.concat(" World");
    System.out.println("1) String: " + s); // Still: Hello

    /*
     * 🧠 2️⃣ StringBuilder
     * StringBuilder are: Mutable
     * Meaning: can modify same object
     * 🌟 Faster Than String: single-threaded operations
     */
    StringBuilder builder = new StringBuilder("Hello");
    builder.append(" World");
    System.out.println("2) StringBuilder Append: " + builder); // No new object creation repeatedly.

    /*
     * 🧠 3️⃣ StringBuffer
     * Almost same as: StringBuilder
     * BUT: thread-safe :Uses synchronization internally.
     * ⚠️ Tradeoff :
     * Safer: multi-threaded
     * But: Slower
     */
    StringBuffer buffer = new StringBuffer("Hello");
    buffer.append(" World");
    System.out.println("3) StringBuffer Append: " + buffer);
    buffer.insert(5, ",");
    System.out.println("4) StringBuffer Insert: " + buffer);
  }

  /*
   * Thread-safe means a class or object can be used by multiple threads at the
   * same time without causing data corruption or unexpected results.
   * A thread is a small unit of work running inside a program. Modern apps often
   * run many threads together.
   * 
   * Example:
   * 1. One thread updates a message
   * 2. Another thread reads the same message
   * If both access the same object simultaneously, problems can happen unless the
   * object is thread-safe.
   * 
   * Why it matters: Suppose two threads try to modify text at the same time.
   * With StringBuilder (not thread-safe):
   * 
   * StringBuilder sb = new StringBuilder("Hi");
   * Thread 1 -> sb.append("A");
   * Thread 2 -> sb.append("B");
   * 
   * Output may become inconsistent because both threads modify the same object
   * together.
   */
}

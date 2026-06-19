package javaPractice;

public class EqualVsOperator {
  /*
   * 🎯 equals() vs ==
   * 
   * | Operator | Checks |
   * | -------- | ------------- |
   * | == | reference |
   * | equals() | value/content |
   * 
   */
  public static void main(String[] args) {
    /*
     * 🧠 == Operator
     * Checks: memory/reference equality
     * Meaning: both variables pointing to same object?
     */
    String a = new String("abc"); // Object - Both values forced store at different location
    String b = new String("abc");
    System.out.println("Using Operator==: " + (a == b)); // different objects in memory

    /*
     * 🧠 equals()
     * Checks: actual content/value equality
     */
    System.out.println("Using equal(): " + a.equals(b)); // both contain same text/value inside Object

    /*
     * 🎯 VERY COMMON INTERVIEW QUESTION
     * 
     * Why Strings behave differently sometimes with == ?
     * Because of: String Pool
     */
    String x = "abc"; // String pool -> both values stored at same location
    String y = "abc";
    System.out.println("String pool: " + (x == y));
  }
  /*
   * 🌟 Visualization
   * 
   * For x="abc" and y="abc" Instead of creating:
   * point to SAME memory location.
   * Java creates ONE pooled object:
   * [abc]
   * / \
   * x y
   * x == y -> true
   * 
   * ⚠️ BUT new String() Is Different
   * String a = new String("abc");
   * String b = new String("abc");
   * 
   * Now Java FORCEFULLY creates: two separate objects
   * a -> [abc]
   * b -> [abc]
   * Different memory So a == b -> false
   */
}

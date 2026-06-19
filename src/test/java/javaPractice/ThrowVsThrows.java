package javaPractice;

public class ThrowVsThrows {
  /*
   * 🎯 throw vs throws
   * 
   * |Keyword| Purpose |
   * |-------|--------------------------|
   * | throw | actually throw exception |
   * | throws| declare possible exception |
   * 
   */
  public static void main(String[] args) throws Exception {

    /*
     * 🧠 throw
     * Used to: explicitly throw an exception inside method/block.
     * throw → throws ONE exception object.
     */
    int age = 10;
    if (age < 18) {
      throw new ArithmeticException("Not eligible");
    }
    /*
     * 🧠 throws
     * Used in: method signature to declare possible exceptions.
     * this method MAY throw exception
     */

    // eg. public void readFile() throws IOException
    /*
     * Throw -> Used inside method, Throws one exception, Explicitly creates
     * exception
     * Throws -> Used in method signature, Declares exceptions, Passes handling
     * responsibility
     */
  }
  /*
   * | Question | Answer |
   * | --------------- | ------------------------------------ |
   * | Why use throw? | Explicitly create/throw exception |
   * | Why use throws? | Delegate handling responsibility |
   * | Difference? | throw = action, throws = declaration |
   */
}

package dsaPractice;

import java.util.*;

public class ValidParentheses {
  public static void main(String[] args) {

    /*
     * 🌟 WHY O(n)?
     * Because: each bracket processed once
     */
    String p = "()[]{}";
    Stack<Character> stack = new Stack<>();

    for (char c : p.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          System.out.println("false");
          return;
        }
        if (c == ')' && stack.peek() == '(' ||
            c == ']' && stack.peek() == '[' ||
            c == '}' && stack.peek() == '{') {
          stack.pop();
        } else {
          System.out.println("false");
          return;
        }
      }
    }
    if (!stack.isEmpty()) {
      System.out.println("false");
      return;
    }
    System.out.println("true");
  }
}

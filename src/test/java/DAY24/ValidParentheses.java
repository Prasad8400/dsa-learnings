package DAY24;

import java.util.*;

public class ValidParentheses {
  public static void main(String[] args) {

    String s = "(){}[]";
    Stack<Character> stack = new Stack<>();

    for (char bracket : s.toCharArray()) {
      if (bracket == '(' || bracket == '[' || bracket == '{') {
        stack.push(bracket);
      } else {
        if (stack.isEmpty()) {
          System.out.println(false);
          return;
        }
        if (bracket == ')' && stack.peek().equals('(') ||
            bracket == ']' && stack.peek().equals('[') ||
            bracket == '}' && stack.peek().equals('{')) {
          stack.pop();
        } else {
          System.out.println(false);
          return;
        }
      }
    }
    if (!stack.isEmpty()) {
      System.out.println(false);
      return;
    }
    System.out.println(true);
  }

}

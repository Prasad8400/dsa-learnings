package DAY40;

import java.util.Stack;

public class ValidParentheses20 {
  public static void main(String[] args) {

    String s = "()[]{}";
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          System.out.println(false);
          return;
        }
        if (c == ')' && stack.peek().equals('(') ||
            c == ']' && stack.peek().equals('[') ||
            c == '}' && stack.peek().equals('{')) {
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

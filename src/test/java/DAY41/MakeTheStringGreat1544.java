package DAY41;

import java.util.Stack;

public class MakeTheStringGreat1544 {
  public static void main(String[] args) {

    String s = "leEeetcode";
    Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {

      if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(c) && stack.peek() != c) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }
    for (char c : stack) {
      sb.append(c);
    }
    System.out.println(sb.toString());
  }

}

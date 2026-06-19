package DAY41;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {
  public static void main(String[] args) {

    String s = "abbaca";
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
      if (!stack.isEmpty() && c == stack.peek()) {
        stack.pop();
      } else {
        stack.push(c);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char c : stack) {
      sb.append(c);
    }

    System.out.println(sb.toString());
  }

}

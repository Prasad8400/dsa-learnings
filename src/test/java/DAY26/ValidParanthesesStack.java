package DAY26;

import java.util.Stack;

public class ValidParanthesesStack {
  public static void main(String[] args) {

    String brackets = "(){}[]";
    Stack<Character> seen = new Stack<>();

    for (char bracket : brackets.toCharArray()) {
      if (bracket == '(' || bracket == '[' || bracket == '{') {
        seen.push(bracket);
      } else {
        if (seen.isEmpty()) {
          System.out.println(false);
          return;
        }
        if (bracket == ')' && seen.peek().equals('(') ||
            bracket == ']' && seen.peek().equals('[') ||
            bracket == '}' && seen.peek().equals('{')) {
          seen.pop();
        } else {
          System.out.println(false);
          return;
        }
      }
    }
    if (!seen.isEmpty()) {
      System.out.println(false);
      return;
    }
    System.out.println(true);
  }

}

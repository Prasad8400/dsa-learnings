package DAY41;

import java.util.Stack;

public class RemoveStarsFromString2390 {
  public static void main(String[] args) {
    String s = "leet**cod*e";
    Stack<Character> stars = new Stack<>();

    for (char c : s.toCharArray()) {
      if (c == '*') {
        if (!stars.isEmpty())
          stars.pop();
      } else {
        stars.push(c);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char c : stars) {
      sb.append(c);
    }
    System.out.println(sb.toString());
  }

}

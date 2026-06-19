package DAY40;

import java.util.Stack;

public class BaseballGame682 {
  public static void main(String[] args) {

    String[] ops = { "5", "2", "C", "D", "+" };
    Stack<Integer> score = new Stack<>();

    for (String op : ops) {
      if (op.equals("C")) {
        score.pop();

      } else if (op.equals("D")) {
        score.push(score.peek() * 2);

      } else if (op.equals("+")) {
        int last = score.pop();
        int previous = score.peek();
        score.push(last);
        score.push(last + previous);

      } else {
        score.push(Integer.valueOf(op));
      }
    }

    int total = 0;

    for (int num : score) {
      total += num;
    }

    System.out.println(total);
  }

}

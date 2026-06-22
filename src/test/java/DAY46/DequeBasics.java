package DAY46;

import java.util.Deque;
import java.util.LinkedList;

public class DequeBasics {
  /*
   * offerLast 10
   * offerLast 20
   * offerFirst 5
   * pollLast once
   * print peekFirst
   * print deque
   */
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();

    dq.offerLast(10);
    dq.offerLast(20);
    dq.offerFirst(5);
    System.out.println("Remove last number: " + dq.pollLast());
    System.out.println("Top number from start: " + dq.peekFirst());
    System.out.println("Print Deque: " + dq);
  }
}

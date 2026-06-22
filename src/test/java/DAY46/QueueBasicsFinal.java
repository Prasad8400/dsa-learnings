package DAY46;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasicsFinal {
  /*
   * offer 10
   * offer 20
   * poll once
   * offer 30
   * print peek
   * print queue
   */
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(10);
    q.offer(20);
    System.out.println("After Adding Numbers: " + q);
    System.out.println("Remove Number: " + q.poll());
    System.out.println("After Removing Number: " + q);
    q.offer(30);
    System.out.println("Top Number: " + q.peek());
    System.out.println("Print Queue: " + q);
  }

}

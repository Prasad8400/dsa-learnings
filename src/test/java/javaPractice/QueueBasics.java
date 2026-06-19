package javaPractice;

import java.util.*;

public class QueueBasics {
  /*
   * 🧠 Queue Concept
   * FIFO → First In First Out
   * Like: ticket counter First person enters: First person enters:
   */
  public static void main(String[] args) {

    Queue<String> anime = new LinkedList<>();

    anime.add("OnePiece");
    anime.add("Naruto");
    anime.add("DemonSlayer");
    System.out.println(anime);

    System.out.println("Poll Removing/Returning head of Queue: " + anime.poll());
    System.out.println("Peek Returning head of Queue: " + anime.peek());
    System.out.println("Queue is Empty: " + anime.isEmpty());

  }
}

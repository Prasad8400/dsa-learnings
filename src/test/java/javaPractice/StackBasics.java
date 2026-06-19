package javaPractice;

import java.util.*;

public class StackBasics {
  /*
   * 🧠 IMPORTANT INTERVIEW POINT
   * 
   * Internally: Stack extends Vector class
   * Meaning: thread-safe but slower
   * Nowadays many prefer: Deque / ArrayDeque
   */
  public static void main(String[] args) {

    /*
     * 🌟 Goal Understand: LIFO → Last In First Out
     */
    Stack<String> anime = new Stack<>();

    anime.push("Naruto"); // Adds item: to top of stack
    anime.push("Bleach");
    anime.push("DeathNote");
    System.out.println("Anime Stack Items: " + anime);

    /*
     * Removes: top/latest item
     */
    anime.pop();
    System.out.println("Last in item Popped first (DeathNote): " + anime);

    /*
     * Returns: top item WITHOUT removing
     */
    System.out.println("Last Item is now: " + anime.peek());
    /*
     * Checks: stack empty or not
     */
    System.out.println("Anime stack is empty: " + anime.isEmpty());
  }
}

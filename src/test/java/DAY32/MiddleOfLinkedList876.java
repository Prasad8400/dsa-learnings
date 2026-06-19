package DAY32;

class Node6 {
  int data;
  Node6 next;

  Node6(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MiddleOfLinkedList876 {
  /*
   * 🎯 LeetCode #876 - Middle of the Linked List
   * Difficulty: Easy
   * Pattern: Fast & Slow Pointer
   * 
   * Problem
   * Given the head of a singly linked list, return the middle Node6.
   * If there are two middle Node6s, return the second middle Node6.
   * 
   * Example 1
   * Input:
   * 1 -> 2 -> 3 -> 4 -> 5
   * Output:
   * 3
   */
  public static void main(String[] args) {

    Node6 list = new Node6(1);
    list.next = new Node6(2);
    list.next.next = new Node6(3);
    list.next.next.next = new Node6(4);
    list.next.next.next.next = new Node6(5);

    Node6 slow = list;
    Node6 fast = list;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    System.out.println(slow.data);
  }
}

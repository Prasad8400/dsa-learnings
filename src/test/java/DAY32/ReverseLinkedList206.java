package DAY32;

class Node8 {
  int data;
  Node8 next;

  Node8(int data) {
    this.data = data;
    this.next = null;
  }
}

public class ReverseLinkedList206 {

  /*
   * 🎯 LeetCode #206 - Reverse Linked List
   * Difficulty: Easy
   * Pattern: Linked List Reversal
   * 
   * Problem
   * Given the head of a singly linked list, reverse the list, and return the
   * reversed list.
   * 
   * Example 1
   * Input:
   * 1 -> 2 -> 3 -> 4 -> 5
   * Output:
   * 5 -> 4 -> 3 -> 2 -> 1
   */
  public static void main(String[] args) {

    Node8 list = new Node8(1);
    list.next = new Node8(2);
    list.next.next = new Node8(3);
    list.next.next.next = new Node8(4);
    list.next.next.next.next = new Node8(5);

    Node8 current = list;
    Node8 prev = null;
    Node8 next = current.next;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    current = prev;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

}

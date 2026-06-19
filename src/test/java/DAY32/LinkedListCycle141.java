package DAY32;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedListCycle141 {
  /*
   * 🎯 LeetCode #141 - Linked List Cycle
   * 
   * Difficulty: Easy
   * Pattern: Fast & Slow Pointer
   * Problem
   * 
   * Given the head of a linked list, determine if the linked list has a cycle.
   * 
   * Return:
   * true
   * 
   * if there is a cycle.
   * Otherwise return:
   * false
   * Example
   * 1 -> 2 -> 3 -> 4
   * ^ |
   * |_________|
   * 
   * Output:
   * true
   */
  public static void main(String[] args) {
    Node list = new Node(1);
    list.next = new Node(2);
    list.next.next = new Node(3);
    list.next.next.next = new Node(4);
    list.next.next.next.next = list.next;

    Node fast = list;
    Node slow = list;

    while (fast != null && fast.next != null) {

      slow = slow.next;
      fast = fast.next.next;

      if (fast == slow) { // at start here I did fast.data==slow.data then checked
        System.out.println(true);
        return;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    System.out.println(false);
  }
}

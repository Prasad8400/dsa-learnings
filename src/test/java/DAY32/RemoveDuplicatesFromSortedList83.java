package DAY32;

class Node7 {
  int data;
  Node7 next;

  Node7(int data) {
    this.data = data;
    this.next = null;
  }
}

public class RemoveDuplicatesFromSortedList83 {
  /*
   * 🎯 LeetCode #83 - Remove Duplicates from Sorted List
   * Difficulty: Easy
   * Pattern: Linked List Traversal
   * 
   * Problem
   * Given the head of a sorted linked list, delete all duplicates such that each
   * element appears only once.
   * Return the linked list sorted as well.
   * 
   * Example
   * Input:
   * 1 -> 1 -> 2 -> 3 -> 3
   * Output:
   * 1 -> 2 -> 3
   */
  public static void main(String[] args) {

    Node7 list = new Node7(1);
    list.next = new Node7(1);
    list.next.next = new Node7(2);
    list.next.next.next = new Node7(3);
    list.next.next.next.next = new Node7(3);

    Node7 current = list;
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }

    current = list;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }
}

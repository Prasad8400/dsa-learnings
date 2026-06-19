package DAY32;

class Node5 {
  int data;
  Node5 next;

  Node5(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MergeTwoSortedLists21 {
  /*
   * 🎯 LeetCode #21 - Merge Two Sorted Lists
   * Difficulty: Easy
   * Pattern: Linked List Merge
   * 
   * Problem
   * You are given the heads of two sorted linked lists.
   * Merge the two lists into one sorted linked list.
   * Return the head of the merged linked list.
   * 
   * Example
   * Input:
   * list1 = [1,2,4]
   * list2 = [1,3,4]
   * Output:
   * [1,1,2,3,4,4]
   */
  public static void main(String[] args) {

    Node5 list1 = new Node5(1);
    list1.next = new Node5(2);
    list1.next.next = new Node5(4);

    Node5 list2 = new Node5(1);
    list2.next = new Node5(3);
    list2.next.next = new Node5(4);

    Node5 temp = new Node5(0);
    Node5 tail = temp;

    while (list1 != null && list2 != null) {
      if (list1.data <= list2.data) {
        tail.next = list1;
        list1 = list1.next; // this I forgot then peeked
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }

    if (list1 != null) { // this I forgot then peeked i did list1.next
      tail.next = list1;
    }
    if (list2 != null) {
      tail.next = list2;
    }

    Node5 current = temp.next; // this line I forgot then peeked
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
  }

}

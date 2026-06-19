package DAY30;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MergeTwoSortedLinkedListExample {
  static void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {

    /*
     * Input:
     * list1 = [1,2,4]
     * list2 = [1,3,4]
     * 
     * Output:
     * [1,1,2,3,4,4]
     */

    Node list1 = new Node(1);
    list1.next = new Node(2);
    list1.next.next = new Node(4);

    Node list2 = new Node(1);
    list2.next = new Node(3);
    list2.next.next = new Node(4);

    // printList(list1);
    // printList(list2);

    Node temp = new Node(0);
    Node tail = temp;

    while (list1 != null && list2 != null) {
      if (list1.data <= list2.data) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }
    if (list1 != null) {
      tail = list1.next;
    }
    if (list2 != null) {
      tail = list2.next;
    }
    printList(temp.next);
  }
}

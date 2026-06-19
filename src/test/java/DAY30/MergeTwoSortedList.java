package DAY30;

class Node4 {
  int data;
  Node4 next;

  Node4(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MergeTwoSortedList {
  static void printList(Node4 head) {
    Node4 current = head;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    Node4 list1 = new Node4(1);
    list1.next = new Node4(2);
    list1.next.next = new Node4(4);

    Node4 list2 = new Node4(1);
    list2.next = new Node4(3);
    list2.next.next = new Node4(4);
    /*
     * printList(list1);
     * printList(list2);
     */
    Node4 dummy = new Node4(0);
    Node4 tail = dummy;

    while (list1 != null & list2 != null) {
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
      tail.next = list1;
    }
    if (list2 != null) {
      tail.next = list2;
    }
    printList(dummy.next);
  }
}

package DAY29;

class Node3 {
  int data;
  Node3 next;

  Node3(int data) {
    this.data = data;
    this.next = null;
  }
}

public class RevLinkedList {
  public static void main(String[] args) {
    // 1 → 2 → 3 → 4 → null
    Node3 one = new Node3(1);
    Node3 two = new Node3(2);
    Node3 three = new Node3(3);
    Node3 four = new Node3(4);

    one.next = two;
    two.next = three;
    three.next = four;
    four.next = null;

    Node3 current = one;
    Node3 next = current.next;
    Node3 prev = null;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    current = prev;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }

  }
}

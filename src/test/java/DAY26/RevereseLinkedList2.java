package DAY26;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

}

public class RevereseLinkedList2 {
  public static void main(String[] args) {
    Node one = new Node(1);
    Node two = new Node(2);
    // Node three = new Node(3);
    Node four = new Node(4);
    Node five = new Node(5);

    one.next = two;
    two.next = five;
    // three.next = four;
    five.next = four;
    four.next = null;

    Node current = one;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }

  }
}

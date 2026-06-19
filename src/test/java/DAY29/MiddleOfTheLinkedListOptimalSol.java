package DAY29;

class Node2 {
  int data;
  Node2 next;

  Node2(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MiddleOfTheLinkedListOptimalSol {
  public static void main(String[] args) {
    Node2 one = new Node2(1);
    Node2 two = new Node2(2);
    Node2 three = new Node2(3);
    Node2 four = new Node2(4);
    Node2 five = new Node2(5);

    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;
    five.next = null;

    Node2 slow = one;
    Node2 fast = one;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    System.out.println(slow.data);
  }
}

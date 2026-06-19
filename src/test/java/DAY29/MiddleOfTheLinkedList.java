package DAY29;

class Node1 {
  int data;
  Node1 next;

  Node1(int data) {
    this.data = data;
    this.next = null;
  }
}

public class MiddleOfTheLinkedList {
  public static void main(String[] args) {
    // 1 → 2 → 3 → 4 → 5
    Node1 one = new Node1(1);
    Node1 two = new Node1(2);
    Node1 three = new Node1(3);
    Node1 four = new Node1(4);
    Node1 five = new Node1(5);

    one.next = two;
    two.next = three;
    three.next = four;
    four.next = five;
    five.next = null;

    Node1 current = one;
    int i = 0;
    while (current != null) {
      i++;
      current = current.next;
    }

    current = one;
    for (int j = 0; j < i / 2; j++) {
      current = current.next;
    }
    System.out.println(current.data);
  }
}

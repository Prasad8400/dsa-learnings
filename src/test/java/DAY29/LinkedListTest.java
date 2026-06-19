package DAY29;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedListTest {
  public static void main(String[] args) {

    Node ten = new Node(10);
    Node twenty = new Node(20);
    Node thirty = new Node(30);
    Node fourty = new Node(40);
    Node fifty = new Node(50);

    ten.next = twenty;
    twenty.next = thirty;
    thirty.next = fourty;
    fourty.next = fifty;
    fifty.next = null;
    /*
    Node current = ten;
    Node prev = null;
    Node next = current.next;
    
     * while (current != null) {
     * next = current.next;
     * current.next = prev;
     * prev = current;
     * current = next;
     * }
     * 
     * current = prev;
     * while (current != null) {
     * System.out.println(current.data);
     * current = current.next;
     * }
     */

    /*
     * int len = 0;
     * while (current != null) {
     * len++;
     * current = current.next;
     * }
     * current = ten;
     * for (int i = 0; i < len / 2; i++) {
     * current = current.next;
     * }
     * System.out.println(current.data);
     */

    Node fast = ten;
    Node slow = ten;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    System.out.println(slow.data);

  }

}

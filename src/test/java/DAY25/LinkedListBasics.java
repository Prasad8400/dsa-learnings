package DAY25;

class Node {
  String data;
  Node next;

  Node(String data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedListBasics {
  public static void main(String[] args) {
    // Shinchan -> Naruto -> Goku -> Luffy
    Node Shinchan = new Node("Shinchan");
    Node Naruto = new Node("Naruto");
    Node Goku = new Node("Goku");
    Node Luffy = new Node("Luffy");

    Shinchan.next = Naruto;
    Naruto.next = Goku;
    Goku.next = Luffy;
    Luffy.next = null;

    Node current = Shinchan;
    Node prev = null;
    Node next = null;

    // while (current != null) {
    // System.out.println("After Adding linkedlist: " + current.data);
    // current = current.next;
    // }

    // Naruto.next = Luffy;
    // while (current != null) {
    // System.out.println("After Deleting linkedlist: " + current.data);
    // current = current.next;
    // }

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
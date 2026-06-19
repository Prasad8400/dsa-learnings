package javaPractice;

import java.util.LinkedList;

public class LinkedLists {
  public static void main(String[] args) {

    LinkedList<String> cartoon = new LinkedList<>();

    /*
     * LinkedList is faster for insertion/deletion because nodes are connected using
     * pointers and shifting is not required.
     * 
     * LinkedList uses nodes.
     * Each node stores: Data Address of next node
     * Features:
     * 1. Fast insertion/deletion
     * 2. Slow random access
     */
    cartoon.add("Doraemon");
    cartoon.add("Shinchan");
    cartoon.add("Ninja Hattori");
    cartoon.add("Perman");
    System.out.println(cartoon);

    cartoon.addFirst("Tom & Jerry");
    System.out.println("After adding first: " + cartoon);

    cartoon.addLast("Kitretsu");
    System.out.println("After adding last: " + cartoon);

    cartoon.remove("Tom & Jerry");
    cartoon.removeLast();

    System.out.println("After Removing: " + cartoon);
  }
}

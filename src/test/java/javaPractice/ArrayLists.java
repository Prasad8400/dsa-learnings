package javaPractice;

import java.util.*;

public class ArrayLists {
  /*
   * | Feature | ArrayList | LinkedList |
   * | ------------------ | ------------- | ------------------- |
   * | get(index) | Fast ✅ | Slow ❌ |
   * | add/remove middle | Slow ❌ | Faster ✅ |
   * | Memory | Less | More |
   * | Internal structure | Dynamic Array | Doubly Linked Nodes |
   */
  public static void main(String[] args) {
    /*
     * ArrayList uses a dynamic array internally.
     * Features:
     * 1. Stores elements in contiguous memory
     * 2. Fast for accessing elements by index
     * 3. Slower for insertions/deletions in the middle
     */
    ArrayList<String> anime = new ArrayList<>();
    anime.add("Naruto");
    anime.add("One Piece");
    anime.add("Bleach");
    anime.add("Pokemon");

    System.out.println(anime);

    anime.remove("Pokemon"); // Pokemon
    anime.remove(0); // Remove

    System.out.println("After removing item: " + anime);
  }
}

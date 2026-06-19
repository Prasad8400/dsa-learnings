package javaPractice;

import java.util.*;

public class HashMaps {
  public static void main(String[] args) {
    /*
     * Keys must be unique
     * Step 1️⃣ Calculate: hashcode from key.
     * Step 2️⃣ Determine bucket/index.
     * Step 3️⃣ Store data there.
     */
    Map<Integer, String> anime = new HashMap<>();
    anime.put(1, "Naruto");
    anime.put(2, "Luffy");
    anime.put(3, "Ash");

    /*
     * 🎯 Collision
     * Sometimes: two keys go to same bucket
     * This is: collision
     * 🧠 Then What Happens?
     * HashMap uses: LinkedList internally
     */
    System.out.println(anime);
    System.out.println("Value of second key: " + anime.get(2));
    anime.remove(3);
    System.out.println("After removing third key: " + anime);

    /*
     * If duplicate key inserted: Old value replaced with New.
     */
    anime.put(3, "Jack");
    anime.put(3, "Ash");

    System.out.println(anime);
  }
}

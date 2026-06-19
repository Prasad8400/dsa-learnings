package javaPractice;

import java.util.*;

public class HashSets {
  public static void main(String[] args) {

    /*
     * 🧠 What Is HashSet? ->
     * Stores Only uniques values
     * No Duplicates allowed
     * HashSet internally uses HashMap
     * No guaranteed order
     * No Index
     */

    Set<String> character = new HashSet<>();
    character.add("Naruto");
    character.add("Sasuke");
    character.add("Hinata");
    character.add("Sakura");
    character.add("Naruto");

    /*
     * 🧠 Common Interview Question: Why no duplicates in HashSet?
     * Because internally: HashMap + hashcode + equals() are used to detect
     * duplicates.
     */
    System.out.println("Duplicate ignored: " + character);
    character.remove("Sakura");
    System.out.println("Removed Sakura: " + character);
    System.out.println("Is Sakura Present: " + character.contains("Sakura"));

  }
}

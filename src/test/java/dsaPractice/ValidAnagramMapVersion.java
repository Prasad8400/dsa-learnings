package dsaPractice;

import java.util.*;

public class ValidAnagramMapVersion {
  /*
   * I used HashMap frequency counting.
   * First, I stored the frequency of every character from both strings.
   * Then I compared both maps using equals().
   * If character frequencies are identical, the strings are anagrams.
   * This approach works in O(n) time complexity.
   */
  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";

    if (s.length() != t.length()) {
      System.out.println("false");
      return;
    }
    /*
     * char[] s1 = s.toCharArray();
     * char[] t1 = t.toCharArray();
     * Arrays.sort(s1);
     * Arrays.sort(t1);
     * for (int i = 0; i < s1.length; i++) {
     * if (s1[i] != t1[i]) {
     * System.out.println("false");
     * return;
     * }
     * }
     * System.out.println("true");
     */
    Map<Character, Integer> t1 = new HashMap<>();
    for (char c : t.toCharArray()) {
      t1.put(c, t1.getOrDefault(c, 0) + 1);
    }
    Map<Character, Integer> s1 = new HashMap<>();
    for (char c : s.toCharArray()) {
      s1.put(c, s1.getOrDefault(c, 0) + 1);
    }

    System.out.println(t1.equals(s1));
  }
}

package dsaPractice;

import java.util.Arrays;

public class ValidAnagramSortingVersion {
  public static void main(String[] args) {
    String a = "anagram";
    String b = "nagaram";

    if (a.length() != b.length()) {
      System.out.println("Not a Anagram");
      return;
    }
    // O(n log n)
    char[] a1 = a.toCharArray();
    char[] b1 = b.toCharArray();

    Arrays.sort(a1);
    Arrays.sort(b1);

    // for (int i = 0; i < a1.length; i++) {
    // if (a1[i] != b1[i]) {
    // System.out.println("Not a Anagram");
    // return; } }
    // System.out.println("Is Anagram");
    System.out.println(Arrays.equals(a1, b1) ? "Is Anagram" : "Not a Anagram");
  }
}

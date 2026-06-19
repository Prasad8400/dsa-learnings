package dsaPractice;

import java.util.Arrays;

public class ValidAnagram {
  public static void main(String[] args) {

    String s = "anagram";
    String t = "nagaram";

    if (s.length() != t.length()) {
      System.out.println(false);
      return;
    }

    char[] c1 = s.toCharArray();
    char[] c2 = t.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    System.out.println(Arrays.equals(c1, c2));
  }
}

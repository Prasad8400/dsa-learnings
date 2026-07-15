package DAY57;

import java.util.*;

public class FirstRepeatedCharacterInterview {
  /*
   * I used HashSet because I only need to check whether a character was already
   * seen.
   * While scanning the string from left to right, if the character already exists
   * in set, I print it as the first repeated character.
   */
  public static void main(String[] args) {
    String s = "automation";
    Set<Character> set = new HashSet<>();

    for (char c : s.toCharArray()) {
      if (set.contains(c)) {
        System.out.println(c);
        break;
      }
      set.add(c);
    }
  }

}

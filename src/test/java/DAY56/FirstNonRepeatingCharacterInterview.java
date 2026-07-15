package DAY56;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInterview {
  /*
   * I used HashMap to store the frequency of each character.
   * Then I iterated over the original string again and printed the first
   * character whose frequency is 1.
   */
  public static void main(String[] args) {
    String s = "automation";
    Map<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (char c : s.toCharArray()) {
      if (map.get(c) == 1) {
        System.out.println(c);
        break;
      }
    }

  }

}

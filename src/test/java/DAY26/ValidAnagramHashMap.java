package DAY26;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramHashMap {

  public static void main(String[] args) {

    String s = "anagram";
    String t = "nagaram";

    if (s.length() != t.length()) {
      System.out.println(false);
      return;
    }
    Map<Character, Integer> s1 = new HashMap<>();
    Map<Character, Integer> t1 = new HashMap<>();

    for (char c : s.toCharArray())
      s1.put(c, s1.getOrDefault(c, 0) + 1);
    for (char c : t.toCharArray())
      t1.put(c, t1.getOrDefault(c, 0) + 1);

    // for(char c : t.toCharArray())
    // map.put(c, map.get(c)-1);

    System.out.println(s1.equals(t1));
  }

}

package DAY28;

import java.util.*;

public class ValidGroupAnagrams {
  public static void main(String[] args) {

    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    Map<String, List<String>> map = new HashMap<>(); // peaked at google

    for (int i = 0; i < strs.length; i++) {
      char[] str = strs[i].toCharArray();
      Arrays.sort(str);
      String key = new String(str); // peaked at google

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(strs[i]); // peaked at google
    }
    System.out.println(map.values()); // peaked at google
  }

}

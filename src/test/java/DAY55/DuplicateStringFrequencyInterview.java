package DAY55;

import java.util.*;

public class DuplicateStringFrequencyInterview {
  /*
   * I used HashMap to store each string as key and its frequency as value.
   * Then I iterated over the map and printed only entries whose count is greater
   * than 1.
   */
  public static void main(String[] args) {
    String[] strs = { "tcs", "infy", "tcs", "wipro", "infy", "tcs" };

    Map<String, Integer> map = new HashMap<>();

    for (String str : strs) {
      map.put(str, map.getOrDefault(str, 0) + 1);
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1)
        System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

}

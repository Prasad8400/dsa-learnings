package DAY56;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyInterview {
  public static void main(String[] args) {
    String s = "java selenium java api selenium java";
    Map<String, Integer> map = new HashMap<>();

    for (String str : s.split(" ")) {
      map.put(str, map.getOrDefault(str.trim(), 0) + 1);
    }

    for (Map.Entry<String, Integer> data : map.entrySet()) {
      System.out.println(data.getKey() + " " + data.getValue());
    }
  }

}

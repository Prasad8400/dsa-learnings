package DAY58;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingWordInterview {
  public static void main(String[] args) {
    String s = "java selenium api java selenium testng";
    Map<String, Integer> map = new HashMap<>();

    for (String word : s.split(" ")) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    for (String word : s.split(" ")) {
      if (map.get(word) == 1) {
        System.out.println(word);
        break;
      }
    }

  }

}

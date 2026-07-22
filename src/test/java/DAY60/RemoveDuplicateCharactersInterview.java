package DAY60;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharactersInterview {
  public static void main(String[] args) {
    String s = "automation";
    Set<Character> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (!set.contains(c)) {
        sb.append(c);
        set.add(c);
      }
    }
    System.out.println(sb.toString());
  }

}

package DAY59;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWordInterview {
  public static void main(String[] args) {
    String s = "java selenium api";
    List<String> ans = new ArrayList<>();

    for (String word : s.split(" ")) {
      StringBuilder sb = new StringBuilder(word);
      ans.add(sb.reverse().toString());
    }
    StringBuilder sb = new StringBuilder();
    for (String word : ans) {
      sb.append(word).append(" ");
    }
    System.out.println(sb.toString().trim());

  }

}

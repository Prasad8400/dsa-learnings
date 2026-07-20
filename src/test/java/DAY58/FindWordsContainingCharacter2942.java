package DAY58;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter2942 {
  public static void main(String[] args) {
    String[] words = { "leet", "code" };
    char x = 'e';
    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
      if (words[i].contains(String.valueOf(x))) {
        ans.add(i);
      }
    }
    System.out.println(ans);
  }

}

package DAY42;

import java.util.*;

public class CheckIfSentenceIsPanagram1832 {
  public static void main(String[] args) {

    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    Set<Character> unique = new HashSet<>();

    for (char c : sentence.toCharArray()) {
      unique.add(c);
    }
    System.out.println(unique.size() == 26);
  }

}

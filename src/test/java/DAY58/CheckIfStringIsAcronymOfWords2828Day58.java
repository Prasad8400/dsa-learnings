package DAY58;

public class CheckIfStringIsAcronymOfWords2828Day58 {
  public static void main(String[] args) {
    String[] words = { "alice", "bob", "charlie" };
    String s = "abc";
    int i = 0;

    if (words.length != s.length()) {
      System.out.println(false);
      return;
    }
    for (String word : words) {
      if (word.charAt(0) != s.charAt(i)) {
        System.out.println(false);
        return;
      }
      i++;
    }
    System.out.println(true);
  }

}

package DAY53;

public class CheckIfStringIsAcronymOfWords2828 {
  public static void main(String[] args) {
    String[] words = { "alice", "bob", "charlie" };
    String s = "abc";
    boolean isAcronym = true;

    if (words.length != s.length()) {
      System.out.println(false);
      return;
    }
    for (int i = 0; i < words.length; i++) {
      if (words[i].charAt(0) != s.charAt(i)) {
        isAcronym = false;
        break;
      }
    }
    System.out.println(isAcronym);
  }
}

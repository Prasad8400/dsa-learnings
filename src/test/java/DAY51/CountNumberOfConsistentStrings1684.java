package DAY51;

public class CountNumberOfConsistentStrings1684 {
  public static void main(String[] args) {
    String allowed = "ab";
    String[] words = { "ad", "bd", "aaab", "baa", "badab" };
    int count = 0;

    for (String word : words) {
      if (word.contains(allowed))
        count++;
    }
    System.out.println(count);
  }

}

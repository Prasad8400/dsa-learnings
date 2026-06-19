package DAY37;

public class CheckIfTwoStringArraysAreEquivalent1662 {
  public static void main(String[] args) {

    String[] word1 = { "ab", "c" };
    String[] word2 = { "a", "bc" };

    StringBuilder str1 = new StringBuilder();
    StringBuilder str2 = new StringBuilder();

    for (String word : word1) {
      str1.append(word);
    }
    for (String word : word2) {
      str2.append(word);
    }
    System.out.println(str1.toString().equals(str2.toString()));

    String s = "Prasad";
    s.concat(" Sutar");
    System.out.println(s);
  }

}

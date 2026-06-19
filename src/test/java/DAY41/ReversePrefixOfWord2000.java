package DAY41;

public class ReversePrefixOfWord2000 {
  public static void main(String[] args) {

    String word = "abcdefd";
    char ch = 'd';
    int len = 0;

    for (int i = 0; i < word.length(); i++) {
      if (ch == word.charAt(i)) {
        len = i + 1;
        break;
      }
    }
    String front = word.substring(0, len);
    String back = word.substring(len);

    StringBuilder sb = new StringBuilder();
    for (int i = front.length() - 1; i >= 0; i--) {
      sb.append(front.charAt(i));
    }
    System.out.println(sb.toString() + back);

  }

}

package DAY24;

public class ValidPalindromeString {
  public static void main(String[] args) {

    String s = "A man, a plan, a canal: Panama";

    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        sb.append(Character.toLowerCase(c));
      }
    }

    String str = sb.toString();
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        System.out.println(false);
        return;
      }
      start++;
      end--;
    }
    System.out.println(true);
  }

}

package DAY46;

public class ScoreOfString3110 {
  public static void main(String[] args) {
    String s = "hello";
    int sum = 0;
    for (int i = 1; i < s.length(); i++) {
      int abs = Math.abs(s.charAt(i - 1) - s.charAt(i));
      sum += abs;
    }
    System.out.println(sum);
  }

}

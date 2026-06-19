package DAY41;

public class SplitStringInBalancedStrings1221 {
  public static void main(String[] args) {

    String s = "RLRRLLRLRL";
    int count = 0;
    int equal = 0;

    for (char c : s.toCharArray()) {
      if (c == 'R') {
        count++;
      } else {
        count--;
      }
      if (count == 0) {
        equal++;
      }
    }
    System.out.println(equal);
  }

}
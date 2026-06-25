package DAY49;

class FindMaxNum {
  int maxNumber(int num, int t) {
    return num + (2 * t);
  }
}

public class FindMaxAchievableNumber2769 {
  public static void main(String[] args) {
    FindMaxNum ans = new FindMaxNum();
    System.out.println(ans.maxNumber(4, 1));
  }

}

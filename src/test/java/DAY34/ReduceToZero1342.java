package DAY34;

public class ReduceToZero1342 {
  public static void main(String[] args) {
    int num = 15;
    int result = num;
    int ans = 0;

    while (result > 0) {
      if (result % 2 == 0) {
        result = result / 2;
      } else {
        result--;
      }
      ans++;
    }
    System.out.println(ans);
  }
}

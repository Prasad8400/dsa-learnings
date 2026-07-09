package DAY53;

public class FirstBadVersion278 {
  static int bad = 4;

  static boolean isBadVersion(int n) {
    return bad <= n;
  }

  public static void main(String[] args) {
    int n = 5;
    int start = 1;
    int end = n;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (isBadVersion(mid))
        end = mid;
      else
        start = mid + 1;
    }
    System.out.println(end);
  }
}

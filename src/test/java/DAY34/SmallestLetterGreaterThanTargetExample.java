package DAY34;

public class SmallestLetterGreaterThanTargetExample {
  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'j' };
    char target = 'a';
    int start = 0;
    int end = letters.length - 1;
    int ans = letters[0];

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < letters[mid]) {
        ans = letters[mid];
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    System.out.println(ans);
  }

}

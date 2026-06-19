package dsaPractice;

public class BinarySearch {
  public static void main(String[] args) {

    int[] nums = { -1, 0, 3, 5, 9, 12 };
    int target = 9;
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        System.out.println(mid);
        return;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    System.out.println(-1);
  }
}

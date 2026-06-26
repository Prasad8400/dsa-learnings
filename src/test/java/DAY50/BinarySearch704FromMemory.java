package DAY50;

class SolutionFor704 {
  int searchNumber(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target)
        return mid;
      else if (nums[mid] < target)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return -1;
  }
}

public class BinarySearch704FromMemory {
  public static void main(String[] args) {
    SolutionFor704 ans = new SolutionFor704();
    System.out.println(ans.searchNumber(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
  }

}

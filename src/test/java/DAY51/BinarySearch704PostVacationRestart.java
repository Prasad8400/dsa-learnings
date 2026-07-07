package DAY51;

class SolutionLC704 {
  int targetPos(int[] nums, int target) {

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

public class BinarySearch704PostVacationRestart {
  public static void main(String[] args) {
    /*
     * nums = {-1, 0, 3, 5, 9, 12}
     * target = 9
     */
    SolutionLC704 ans = new SolutionLC704();
    System.out.println(ans.targetPos(new int[] { -1, 0, 3, 5, 9, 12 }, 9));
  }

}

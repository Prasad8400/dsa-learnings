package DAY51;

class Ans35 {
  int insertPos(int[] nums, int target) {
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
    return start;
  }
}

public class SearchInsertPosition35PostVacationRestart {
  public static void main(String[] args) {
    /*
     * nums = {1, 3, 5, 6}
     * target = 2
     */
    Ans35 ans = new Ans35();
    System.out.println(ans.insertPos(new int[] { 1, 3, 5, 6 }, 2));
  }
}

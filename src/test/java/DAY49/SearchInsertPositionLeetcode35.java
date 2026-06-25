package DAY49;

class SearchInsertSolution {
  public int insertPosition(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target)
        return mid;
      else if (nums[mid] < target)
        left = mid + 1;
      else
        right = mid - 1;
    }
    return left;
  }
}

public class SearchInsertPositionLeetcode35 {
  public static void main(String[] args) {
    SearchInsertSolution sol = new SearchInsertSolution();
    System.out.println(sol.insertPosition(new int[] { 1, 3, 5, 6 }, 5));
  }

}

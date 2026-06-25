package DAY49;

class Solution {
  public int search(int[] nums, int target) {

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

public class BinarySearchBasics {
  public static void main(String[] args) {
    Solution ans = new Solution();
    System.out.println(ans.search(new int[] { -1, 0, 3, 5, 9, 12 }, 0));
  }
}
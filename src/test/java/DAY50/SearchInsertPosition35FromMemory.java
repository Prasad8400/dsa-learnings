package DAY50;

class SolFor35 {

  int insertPos(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int k = start + (end - start) / 2;

      if (nums[k] == target)
        return k;
      else if (nums[k] < target)
        start = k + 1;
      else
        end = k - 1;
    }
    return start;

  }

}

public class SearchInsertPosition35FromMemory {
  public static void main(String[] args) {
    SolFor35 ans = new SolFor35();
    System.out.println(ans.insertPos(new int[] { 1, 3, 5, 6 }, 5));
  }
}

package dsaPractice;

public class SlidingWindowMaxSum {
  public static void main(String[] args) {

    int[] nums = { 2, 1, 5, 1, 3, 2 };
    int k = 3;
    int sum = 0;

    for (int i = 0; i < k; i++) {
      sum += nums[i];
    }

    int max = sum;

    for (int i = k; i < nums.length; i++) {
      sum = sum - nums[i - k] + nums[i]; // Substracting i - k first elements from start and adding new
      max = Math.max(max, sum);
    }

    System.out.println(max);
  }

}

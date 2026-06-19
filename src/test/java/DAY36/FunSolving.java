package DAY36;

import java.util.HashSet;
import java.util.Set;

public class FunSolving {

  public static void main(String[] args) {

    /*
    Input:
    "1.1.1.1"
    Output:
    "1[.]1[.]1[.]1"
    */

    String ip = "1.1.1.1";
    StringBuilder sb = new StringBuilder();

    for (char c : ip.toCharArray()) {
      if (c == '.') {
        sb.append("[.]");
      } else {
        sb.append(c);
      }
    }
    System.out.println(sb.toString());

    /*
    Input:
    [9,6,4,2,3,5,7,0,1]
    
    Output:
    8
     */
    int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    int sum = 0;
    int actualSum = 0;

    for (int num : nums) {
      sum += num;
    }
    for (int i = 0; i <= nums.length; i++) {
      actualSum += i;
    }
    System.out.println(actualSum - sum);

    String jewels = "abc";
    String stones = "aabbccddee";
    int count = 0;
    Set<Character> seen = new HashSet<>();

    for (char c : jewels.toCharArray()) {
      seen.add(c);
    }

    for (char c : stones.toCharArray()) {
      if (seen.contains(c)) {
        count++;
      }
    }
    System.out.println(count);

    String s = "codeleet";
    int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
    char[] result = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      result[indices[i]] = s.charAt(i);
    }
    String res = new String(result);
    System.out.println(res);
  }
}
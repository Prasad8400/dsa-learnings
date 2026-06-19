package dsaPractice;

public class LongestCommonPrefix {
  public static void main(String[] args) {

    String[] strs = { "flower", "flow", "flight" };

    /*
     * One approach is sorting and comparing first and last strings.
     * But sorting increases complexity to O(n log n).
     * A better approach is taking the first string as prefix and continuously
     * shrinking it until all strings start with that prefix.
     * 
     * Arrays.sort(strs);
     * String first = strs[0];
     * String last = strs[strs.length - 1];
     * String result = "";
     * for (int i = 0; i < first.length(); i++) {
     * if (first.charAt(i) == last.charAt(i)) {
     * result += first.charAt(i);
     * } else {
     * break;
     * }
     * }
     * System.out.println(result);
     */

    String prefix = strs[0];
    for (int i = 0; i < strs.length; i++) {
      while (!strs[i].startsWith(prefix)) {
        /*
         * while mismatch exists:
         * cut last character
         */
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    System.out.println(prefix);
  }

}

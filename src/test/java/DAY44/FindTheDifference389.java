package DAY44;

public class FindTheDifference389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ans ^= t.charAt(i);
        }
        System.out.println(ans);
    }

}

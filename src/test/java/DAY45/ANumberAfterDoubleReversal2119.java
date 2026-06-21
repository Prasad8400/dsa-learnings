package DAY45;

public class ANumberAfterDoubleReversal2119 {

    static int reversed(int num) {

        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        int n = Integer.valueOf(sb.toString());
        return n;
    }

    public static void main(String[] args) {

        int num = 123;
        int reversed1 = reversed(num);
        int reversed2 = reversed(reversed1);
        System.out.println(num == reversed2);

    }

}

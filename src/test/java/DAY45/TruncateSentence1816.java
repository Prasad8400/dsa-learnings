package DAY45;

public class TruncateSentence1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(strs[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }

}

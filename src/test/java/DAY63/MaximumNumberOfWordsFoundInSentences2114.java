package DAY63;

public class MaximumNumberOfWordsFoundInSentences2114 {
    public static void main(String[] args) {
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        int maxWords = 0;

        /*
         * For each word from sentence I will save its count in one int variable then
         * will check it against max var if its greater will save it as greater if not
         * move with same for next sentence
         */
        for (String sentence : sentences) {
            int maxWordCount = 0;
            for (String word : sentence.trim().split("\\s+")) {
                maxWordCount++;
            }
            maxWords = Math.max(maxWordCount, maxWords);
        }
        System.out.println(maxWords);
    }

}

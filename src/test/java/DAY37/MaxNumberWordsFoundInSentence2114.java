package DAY37;

public class MaxNumberWordsFoundInSentence2114 {
  public static void main(String[] args) {

    String[] sentences = {
        "alice and bob love leetcode",
        "i think so too",
        "this is great thanks very much"
    };
    int max = 0;

    for (String sentence : sentences) {

      int count = sentence.split(" ").length;
      /* 
      for (int i = 0; i < words.length; i++) {
        if (words[i] != null) {
          count++;
        }
      }
      */
      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}

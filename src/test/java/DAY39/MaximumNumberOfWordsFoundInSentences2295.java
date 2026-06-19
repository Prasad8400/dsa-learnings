package DAY39;

public class MaximumNumberOfWordsFoundInSentences2295 {
  public static void main(String[] args) {

    String[] sentences = {
        "please wait",
        "continue to fight",
        "continue to win"
    };
    int max = 0;

    for (String str : sentences) {
      String[] s = str.split(" ");
      int count = s.length;
      max = Math.max(max, count);
    }

    System.out.println(max);
  }

}

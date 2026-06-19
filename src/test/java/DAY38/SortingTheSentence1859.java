package DAY38;

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence1859 {
  public static void main(String[] args) {

    String s = "is2 sentence4 This1 a3";
    String[] str = s.split(" ");
    //String[] result = new String[str.length];

    Map<Integer, String> map = new HashMap<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length; i++) {
      int num = Integer.valueOf(str[i].substring(str[i].length() - 1));
      String str1 = str[i].substring(0, str[i].length() - 1);
      map.put(num, str1 + " ");
    }
    for (int i = 1; i <= map.size(); i++) {
      sb.append(map.get(i));

      /*
      for(String word : str){
      
      int pos = word.charAt(word.length()-1) - '1';
      
      result[pos] =
        word.substring(0, word.length()-1);
      }
       */
    }
    System.out.println(sb.toString());
  }

}

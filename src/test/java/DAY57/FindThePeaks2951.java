package DAY57;

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks2951 {
  public static void main(String[] args) {

    int[] mountain = { 1, 4, 3, 8, 5 };
    List<Integer> list = new ArrayList<>();

    if (mountain.length < 3) {
      System.out.println(list);
      return;
    }

    for (int i = 1; i < mountain.length - 1; i++) {
      if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
        list.add(i);
      }
    }
    System.out.println(list);

  }

}

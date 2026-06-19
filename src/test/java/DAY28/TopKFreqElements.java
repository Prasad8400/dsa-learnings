package DAY28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopKFreqElements {
  public static void main(String[] args) {

    int[] nums = { 1, 1, 1, 2, 2, 3 };
    Map<Integer, Integer> map = new HashMap<>();
    int k = 2;

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((a, b) -> b.getValue() - a.getValue());

    for (int i = 0; i < k; i++) {
      System.out.println(list.get(i).getKey());
    }

  }
}

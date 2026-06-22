package DAY46;

import java.util.Deque;
import java.util.LinkedList;

public class CrawlerLogFolder1598 {
  public static void main(String[] args) {
    String[] logs = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
    int ops = 0;
    Deque<String> dq = new LinkedList<>();

    for (String log : logs) {
      if (log.equals("../")) {
        if (!dq.isEmpty())
          dq.removeLast();
      } else if (log.equals("./")) {

      } else {
        dq.offerLast(log);
      }
      /*
       * if (log.equals("../")) {
       * if (ops > 0) {
       * ops--;
       * }
       * } else if (log.equals("./")) {
       * 
       * } else {
       * ops++;
       * }
       */
    }
    // System.out.println(ops);
    System.out.println(dq.size());
  }

}

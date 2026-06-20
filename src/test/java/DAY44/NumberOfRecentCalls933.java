package DAY44;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> q = new LinkedList<>();

    int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}

public class NumberOfRecentCalls933 {
    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));
    }

}

package DAY45;

import java.util.LinkedList;
import java.util.Queue;

public class EmptyQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(5);
        q.offer(10);
        q.offer(15);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }

}

package DAY44;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);
        System.out.println(q.peek()); // front
        System.out.println(q.poll()); // remove
        System.out.println(q);

        q.offer(10); // add
        System.out.println(q);
    }
}

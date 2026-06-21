package DAY45;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeededToBuyTickets2073 {
    public static void main(String[] args) {
        int[] tickets = { 2, 3, 2 };
        int k = 2;
        Queue<Integer> q = new LinkedList<>();
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
        while (!q.isEmpty()) {
            int person = q.poll();

            tickets[person]--;
            time++;

            if (person == k && tickets[person] == 0) {
                break;
            }

            if (tickets[person] > 0) {
                q.offer(person);
            }
        }

        System.out.println(time);
    }

}

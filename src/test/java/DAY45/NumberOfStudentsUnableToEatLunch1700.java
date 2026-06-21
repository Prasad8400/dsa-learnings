package DAY45;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch1700 {
    public static void main(String[] args) {

        /*
         * 0 = circular sandwich
         * 1 = square sandwich
         */
        int[] students = { 1, 1, 1, 0, 0, 1 };
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 };

        Queue<Integer> student = new LinkedList<>();
        for (int s : students) {
            student.offer(s);
        }

        int i = 0;
        int rotation = 0;

        while (!student.isEmpty() && rotation < student.size()) {

            if (student.peek() == sandwiches[i]) {
                student.poll();
                i++;
                rotation = 0;
            } else {
                int front = student.poll();
                student.offer(front);
                rotation++;
            }
        }

        System.out.println(student.size());
    }

}

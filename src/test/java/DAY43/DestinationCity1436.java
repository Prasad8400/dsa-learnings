package DAY43;

import java.util.HashSet;
import java.util.Set;

public class DestinationCity1436 {
    public static void main(String[] args) {

        String[][] paths = {
                { "London", "New York" },
                { "New York", "Lima" },
                { "Lima", "Sao Paulo" }
        };
        Set<String> set = new HashSet<>();

        for (String[] path : paths) {
            set.add(path[0]);
        }

        for (String[] path : paths) {
            if (!set.contains(path[1])) {
                System.out.println(path[1]);
                break;
            }
        }

    }
}

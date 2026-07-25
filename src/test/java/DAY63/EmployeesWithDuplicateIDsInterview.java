package DAY63;

import java.util.HashMap;
import java.util.Map;

public class EmployeesWithDuplicateIDsInterview {
    /*
     * I will Store employeeIds in map with its frequcies as value then using Map
     * Entry will iterate through map and print key and value
     */
    public static void main(String[] args) {

        int[] employeeIds = {
                101, 102, 103, 101, 104, 105,
                102, 101, 106, 104
        };

        Map<Integer, Integer> empId = new HashMap<>();

        for (int id : employeeIds) {
            empId.put(id, empId.getOrDefault(id, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : empId.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}

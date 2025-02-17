package Day6;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        // Adding 5 entries
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Emma");

        // Updating the name for one employee
        employeeMap.put(103, "Carlos");

        // Checking if an employee ID exists
        int searchId = 104;
        if (employeeMap.containsKey(searchId)) {
            System.out.println("Employee ID " + searchId + " exists in the directory.");
        } else {
            System.out.println("Employee ID " + searchId + " not found.");
        }

        // Printing all employee IDs and names
        System.out.println("Employee Directory:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

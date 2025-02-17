package Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        // Adding 5 student names
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Emma");

        // Removing a student by name
        students.remove("Charlie");

        // Sorting the list alphabetically
        Collections.sort(students);

        // Printing the final list
        System.out.println("Final Student List: " + students);
    }
}


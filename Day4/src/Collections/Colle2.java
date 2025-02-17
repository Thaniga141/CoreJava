package Collections;

import java.util.*;

public class Colle2 {
    public static void main(String[] args) {
        // Creating a Map and adding elements
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");

        // Traversing Map
        Set<Map.Entry<Integer, String>> set = map.entrySet(); // Converting to Set to traverse
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next(); // Getting key-value pairs
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

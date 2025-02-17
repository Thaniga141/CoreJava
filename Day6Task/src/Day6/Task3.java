package Day6;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

        // Adding 5 city names
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Miami");

        // Checking if a specific city exists
        String searchCity = "Chicago";
        if (cities.contains(searchCity)) {
            System.out.println(searchCity + " is in the set.");
        } else {
            System.out.println(searchCity + " is not in the set.");
        }

        // Removing one city
        cities.remove("Miami");

        // Printing all cities
        System.out.println("Final list of cities: " + cities);
    }
}

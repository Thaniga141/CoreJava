package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collet3 {
	public static void main(String[] args) {

		// Step 1: Create a HashSet
		HashSet<String> set = new HashSet<>();

		// Step 2: Add elements to the HashSet
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi"); // Duplicate element
		set.add("Ajay");
		

		// Step 3: Traversing elements using for-each loop
		System.out.println("Elements in the HashSet:");
		for (String element : set) {
			System.out.println(element);
		}

			// Step 1: Create a LinkedHashSet
			LinkedHashSet<String> set1 = new LinkedHashSet<>();

			// Step 2: Add elements to the LinkedHashSet
			set.add("Ravi");
			set.add("Vijay");
			set.add("Ravi"); // Duplicate element
			set.add("Ajay");

			// Step 3: Traverse elements using for-each loop
			System.out.println("Elements in the LinkedHashSet:");
			for (String element1 : set) {
				System.out.println(element1);
			}

				// Step 1: Create a TreeSet and add elements
				TreeSet<String> set2 = new TreeSet<>();
				set.add("Ravi");
				set.add("Vijay");
				set.add("Ravi"); // Duplicate element
				set.add("Ajay");

				// Step 2: Traverse elements using a for-each loop
				System.out.println("Elements in the TreeSet:");
				for (String element2 : set) {
					System.out.println(element2);
				}
			}
		}


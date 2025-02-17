package Features;

import java.util.*;

//public class PracticeFeature {
//	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//		names.forEach(name -> System.out.println(name));
//	}
//}

interface Greeting {
    void sayHello(String message);
}

public class PracticeFeature {
    public static void main(String[] args) {
        // Lambda expression to implement the Greeting interface
        Greeting greeting = (message) -> System.out.println("Hello, " + message);
        
        // Using the lambda expression
        greeting.sayHello("World");
    }
}
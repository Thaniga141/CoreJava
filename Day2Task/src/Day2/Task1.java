package Day2;

public class Task1 {

	public static void main(String[] args) {
		 // Variable declaration and initialization
        int age = 25;
        double price = 99.99;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "John Doe";

        // Print values
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Name: " + name);
        
        System.out.println();

        
        //swapping without third variable
        int a = 10, b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap logic without a third variable
        a = a + b; // a becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

        System.out.println("After Swap: a = " + a + ", b = " + b);
        
        System.out.println();
        
        
        //area of rectangle
        // Declare and initialize length and breadth
        double length = 5.5;
        double breadth = 3.2;

        // Calculate area
        double area = length * breadth;

        // Print the area
        System.out.println("Area of the rectangle: " + area);

    }

	}



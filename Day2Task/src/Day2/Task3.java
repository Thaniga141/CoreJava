package Day2;

import java.util.Scanner;

public class Task3 {
     //add two numbers
	 public static int add(int a, int b) {
	        return a + b;
	    }
     //perimeter and area of circle
	 public static double calculatePerimeter(double radius) {
	        return 2 * Math.PI * radius;
	    }

	    // Method to calculate the area of a circle
	    public static double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	    
	   //prime checker 
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false; // Numbers less than or equal to 1 are not prime
	        }
	        
	        for (int i = 2; i < number; i++) {
	            if (number % i == 0) {
	                return false; // If divisible by any number, it's not prime
	            }
	        }
	        return true; // If no divisors found, it's prime
	    }


	    public static void main(String[] args) {
	        int sum = add(5, 10); // Calling the add method
	        System.out.println("Sum: " + sum);
	        System.out.println();
	        
	        
	        double radius = 7.0; // Example radius

	        // Calling methods and printing results
	        System.out.println("Perimeter of the circle: " + calculatePerimeter(radius));
	        System.out.println("Area of the circle: " + calculateArea(radius));
	        System.out.println();
	        
	        
	        
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is prime
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        
	    }
	}



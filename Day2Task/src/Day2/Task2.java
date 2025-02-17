package Day2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Input a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if positive, negative, or zero
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	        
	        //even number
	        System.out.println("Even numbers from 1 to 50:");

	        for (int i = 1; i <= 50; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	             
	            }
	        }
	        System.out.println();
            System.out.println();
	        

	        // Input a number
	        System.out.print("Enter a number to find its factorial: ");
	        int num = scanner.nextInt();

	        int factorial = 1;
	        int i = 1;

	        // Calculate factorial using a while loop
	        while (i <= num) {
	            factorial *= i;
	            i++;
	        }

	        System.out.println("Factorial of " + num + " is: " + factorial);
	        System.out.println();


	        
	        
	        Scanner scanner1 = new Scanner(System.in);

	        // Input two numbers
	        System.out.print("Enter the first number: ");
	        double num1 = scanner1.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner1.nextDouble();

	        // Input the operation
	        System.out.println("Choose an operation: +, -, *, /");
	        char operator = scanner1.next().charAt(0);

	        double result;

	        // Perform the operation using a switch statement
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator. Please choose +, -, *, or /.");
	        }


	}

}

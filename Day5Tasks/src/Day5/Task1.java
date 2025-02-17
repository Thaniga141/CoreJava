package Day5;

//basic calculator
public class Task1 {

    class Calculator {
        // Methods for basic operations
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public double divide(int a, int b) {
            if (b == 0) {
                System.out.println("Division by zero is not allowed!");
                return 0;
            }
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        Task1 task = new Task1(); // Create an instance of the outer class
        Calculator calc = task.new Calculator(); // Create an instance of the inner class
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(5, 3));
    }
}


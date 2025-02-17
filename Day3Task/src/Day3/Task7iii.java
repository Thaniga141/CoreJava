package Day3;

//finally block
public class Task7iii {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Division by zero.");
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}

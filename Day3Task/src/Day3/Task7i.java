package Day3;

//multi catch blocks
public class Task7i {
    public static void main(String[] args) {
        try {
            String[] array = {"1", "two", "3"};
            int number = Integer.parseInt(array[0]); // ArrayIndexOutOfBoundsException
            System.out.println("Number: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong!");
        } finally {
            System.out.println("Program ended.");
        }
    }
}


//public class Task7i {
//    public static void main(String[] args) {
//        try {
//            int[] numbers = {1, 2, 3};
//            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
//
//            int result = Integer.parseInt("abc"); // NumberFormatException
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error: Index out of bounds!");
//        } catch (NumberFormatException e) {
//            System.out.println("Error: Invalid number format!");
//        }
//    }
//}
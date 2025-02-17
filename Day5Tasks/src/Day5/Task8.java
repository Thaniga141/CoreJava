package Day5;

//method overloading
public class Task8 {

    class SumCalculator {
        public int sum(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b, int c) {
            return a + b + c;
        }

        public int sum(int[] arr) {
            int total = 0;
            for (int num : arr) {
                total += num;
            }
            return total;
        }

        public static void main(String[] args) {
            Task8 task = new Task8();  // Create an instance of Task8
            SumCalculator calc = task.new SumCalculator();  // Create an instance of SumCalculator

            System.out.println("Sum of 2 numbers: " + calc.sum(5, 3));  // Call sum for 2 numbers
            System.out.println("Sum of 3 numbers: " + calc.sum(5, 3, 2));  // Call sum for 3 numbers
            System.out.println("Sum of array: " + calc.sum(new int[]{1, 2, 3, 4, 5}));  // Call sum for an array
        }
    }
}

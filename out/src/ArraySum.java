public class ArraySum {
        public static void findThreeSum(int[] arr, int target) {
            for (int i = 0; i < arr.length - 2; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[i] + arr[j] + arr[k] == target) {
                            System.out.println("Elements: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                            return;
                        }
                    }
                }
            }
            System.out.println("No such elements found.");
        }

        public static void main(String[] args) {
            int[] arr = {4, 9, -2, 0, 5};
            int target = 11;
            findThreeSum(arr, target);
        }
    }

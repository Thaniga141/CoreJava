public class Practice {
        public static void main(String[] args) {
            int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13, 99};
            int k = 4;
            printMax(arr, k);
        }

        public static void printMax(int[] arr, int k) {
            for (int i = 0; i <= arr.length - k; i++) {
                int max = arr[i];
                for (int j = 1; j < k; j++)
                {
                    if (arr[i + j] > max)
                    {
                        max = arr[i + j];
                    }
                }
                System.out.print(max + " ");
            }
        }
}


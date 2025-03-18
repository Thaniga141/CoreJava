public class UniqueElements {
    public static void main(String[] args)
    {
        int[] arr ={10,20,30,20,10,50,60,40,80,50,40};
        for(int j=0; j<arr.length-1; j++)
        {
            int arr1 = arr[j];
            int count = 1;
            for(int i=j+1; i<arr.length; i++)
            {
                if(arr1 == arr[i])
                {
                 count++;
                 arr[i] = -1;
                }
            }
            if(count == 1 && arr1 != -1)
            {
                System.out.print(arr[j] + " ");
            }
        }

    }
}

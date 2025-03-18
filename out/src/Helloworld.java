import java.util.HashMap;

class HelloWorld {
    public static void main(String[] args) {
        int arr[]={7,7,2,5,7,5,3,4,2};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for(int i : hm.keySet())
        {
            System.out.println(i +":"+ hm.get(i));
        }
    }
}

public class Reverse {
    public static void main(String[] args){
        String name = "Thaniga Kalanidhi";
        for(int i=name.length()-1; i>=8; i-- )
        {
            System.out.print(name.charAt(i) + " ");
        }
    }
}

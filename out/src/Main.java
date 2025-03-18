import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 10 == 7 || n % 7 == 0){
            System.out.println("Buzz number");
        }
        else{
            System.out.println("Not a buzz number");
        }
    }
}
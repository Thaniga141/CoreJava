public class ReverseString {

    public static void main(String[] args) {

        String name = "ThanigaKalanidhi";
//        String rev = "";
//        char ch;
        int start = name.length() - 1;
        int end = 0;

        while (start >= end) {
            System.out.print(name.charAt(start) + " ");
            start--;
        }
//        for(int i=0; i<name.length(); i++){
//            ch = name.charAt(i);
//            rev = ch + rev;
//        }
//        System.out.println(rev);
//    }
//
//}
    }
}
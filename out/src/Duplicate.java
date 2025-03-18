public class Duplicate {

    public static void main(String[] args) {
        int[] thaniga = {10,10,20,20,30,30,50,40,10,10};

        for(int j = 0; j < thaniga.length - 1; j++) {
            int kalanidhi = thaniga[j];

            int count = 1;
            for(int i = j + 1; i < thaniga.length; i++) {
                if(kalanidhi == thaniga[i]) {
                    count++;
                    thaniga[i] = -1;
                }
            }
//            if(count > 1 && kalanidhi != -1 ) {
//                System.out.println(kalanidhi);
//            }
        }
        for(int num : thaniga){
            if(num != -1) {
                System.out.println(num);
            }
        }


    }

}

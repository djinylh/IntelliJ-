package ch04.sec04;

public class Mission06 {
    public static void main(String[] args) {
        /*
        * 1부터 몇까지더하면 누적합계가 100 을 넘지않는 제일 큰 수가 무엇인지?
        */
        int sum = 0;
//        for(int i=1 ; ; i++){
//
//            if(sum+i>100) {
//                System.out.println(i-1);
//                break;
//            } else {
//                sum +=i;
//            }
//        }
        int i=1;

        boolean a = true;
        while (a) {
            if (sum+i>100){
                System.out.println(i-1);
                a= false;
            } else
                sum +=i;
                i++;
        }



    }
}

package ch04.sec04;

public class Mission01Method {
    public static void main(String[] args) {
        int sum = sumFromTo(10,20); // 10~ 20까지 모두 더한 값 리턴
        System.out.println(sum);
        int sum2 = sumFromTo(15,49); // 15~49까지 모두 더한 값 리턴
        System.out.println(sum2);

    }
    public static int sumFromTo(int a, int b){
        int sum= 0;
        for(int i = a;i<=b;i++ ){
            sum +=i;
        }
        return sum;

    }



}

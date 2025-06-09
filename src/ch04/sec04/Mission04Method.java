package ch04.sec04;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4);

        System.out.println("==========================");

        gugudan(4,9); // 4~9단까지 출력
        System.out.println("===========================");
        gugudan(2,4); // 2~4단까지 출력
    }

    public static void gugudan(int num){
        for (int i = 1; i<=9; i++ ){
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }


    }
public static void gugudan(int num1,int num2) {
        for (int i = num1; i <=num2;i++) {
            gugudan(i);
        }

}
}

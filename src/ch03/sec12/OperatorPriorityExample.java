package ch03.sec12;

public class OperatorPriorityExample {
    public static void main(String[] args) {
        /*
        연산 순위
        x > 0 && y < 0의 연산 순서는
        1. x >0
        2. y <0
        3. 결과 불린값 && 결과 불린값
       ( 100*2 / 3%5)
       1. 100 * 2 = 200
       2. 200 / 3
       3. 2의 결과값 % 5

         */
        int a,b,c;
        a = b = c = 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int var = 1, var2= 3, var3 =2 ;
        int result = var+var2 * var3 ;
        System.out.println(result); //7
        int result2 = (var +var2) * var3;
        System.out.println(result2);

    }
}

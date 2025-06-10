package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        // 한 변의 길이가 48인 정사각형의 넓이를 구하기
        Calculator wid = new Calculator();
        double rec= wid.area(40);
        System.out.println(rec);

        double rec2=wid.area(40,60);
        System.out.println(rec2);




    }
}

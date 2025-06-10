package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int result = cal.plus(1,2);
        System.out.println("result: " + result);
        System.out.println("result2: " + cal.plus(10,20));
        System.out.println("result3: "+30);
        System.out.println("끝");

        for(int i=0; i<20; i++) {
            cal.powerOn();
        }
        cal.powerOff();
    }
}

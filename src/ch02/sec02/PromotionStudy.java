package ch02.sec02;

public class PromotionStudy {
    public static void main(String[] args) {
        /*
        자동 타입 변환(promotion): (숫자형: 정수, 실수)작은 타입이 범위가 큰 탕비으로 대입될 때 발생

        byte < short, char < int < long < float < double

        모든 (타입 + string)이 되면 모든 타입이 String으로 파싱된다.

    b



         */
    byte byteVal = 10;
    int intVal = byteVal;
        System.out.println("intVal: " + intVal);


        char charVal = '가';
        int intVal2 = charVal;
        System.out.println("intVal2: " + intVal2);
        System.out.printf("%c\n", 44032);


        long longVal2 = 9_223_372_036_854_775_807l;
        float floatVal = longVal2;
        System.out.println(floatVal);
        long longVal3 = (long)floatVal;
        System.out.println(longVal3);
        float floatVal2 = 100.4f;
        double doublerVal = floatVal2;
        System.out.println(doublerVal);


    }
}

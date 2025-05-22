package ch02.sec01;

public class VariableInitExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;

        //3시간 5분
        // 총 185분
        int totalmin = (hour * 60) + min;
        System.out.printf("%d시간 %d분\n", hour,min);
        System.out.println("총 " +totalmin+"분");

    }
}

package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {

        printTime(10, 20); // 10:20
        printTime(2, 20); // 10:20
        printTime(2, 9, 0); // 10:20
        printTime(12, 9, 22); // 10:20
    }
public static String parseTime(int val){
        return val <10? "0" + val:String.valueOf(val);
}
    public static void printTime(int time1, int time2) {
//        System.out.print((hour < 10 ? "0" + hour : hour) + ":");
//        System.out.println((min < 10 ? "0" + min : min));
        System.out.println(parseTime(time1)+":"+parseTime(time2));
    }

    public static void printTime(int hour, int min, int sec) {
//        System.out.printf("%02d:%02d", hour, min);

//        System.out.print((hour < 10 ? "0" + hour : hour) + ":");
//        System.out.print((min < 10 ? "0" + min : min) + ":");
//        System.out.println(sec < 10 ? "0" + sec : sec);
        System.out.print(parseTime(hour)+":");
        printTime(min,sec);
    }
}
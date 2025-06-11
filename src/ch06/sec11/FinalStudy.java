package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        final int num = 10;
        final int num2;
        num2 = 10;
//        num2 = 20;
        PrintStream ps = System.out;
//        System.out = null;
        System.out.println();

        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge(); // immutable
        fo2.myAge();
    }
}

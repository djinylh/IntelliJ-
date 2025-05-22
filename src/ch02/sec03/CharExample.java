package ch02.sec03;

import javax.xml.transform.Source;

public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';

        System.out.printf("ch1: %c, %d\n", ch1, (int)ch1);
        System.out.printf("66: %c, %d\n", 66, 66);
        System.out.printf("66: %c, %d\n", 67, 67);


        char ch2 = 68;
        System.out.printf("ch2: %c, %d\n", ch2, (int)ch2);

        char ch3 = '가';
        System.out.printf("ch3: %c, %d\n", ch3, (int)ch3);
        System.out.printf("핣: %c, %d\n", '핣', (int)'핣');
        System.out.printf("힓: %c, %d\n", '힓', (int)'힓');

    }
}

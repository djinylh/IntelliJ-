package ch04.sec04;

import ch02.sec11.ScoreMethodExample;

public class MissionMethod {
    public static void main(String[] args) {

        int star = ScoreMethodExample.getRandomValue(3, 6);
        System.out.println("star: " + star);

        printStingleLine(star); // 5였다면 ***** / 3이였다면 ***

        System.out.println("----------------------");


        printMultiLine(4);
        System.out.println();
        System.out.println("----------------------");



        printMultiLine(7);

        System.out.println("------------------");

        printTriangleLine(4);

    }

    public static void printStingleLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
public static void printMultiLine(int star) {
        for(int i=0;i<star;i++){
           printStingleLine(star);
            }
        }
public  static  void printTriangleLine(int star){
        for(int i=0; i<=star;i++){
            printStingleLine(i);
        }

}

}




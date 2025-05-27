package ch04.sec02;

import java. util.Scanner;
public class Mission02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 >");
        int num = scanner.nextInt();

        if (num >100 || num <0) {
            System.out.println("잘못된 점수입니다");
        }
        else {
        switch (num/10) {
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }


        }




    }
}

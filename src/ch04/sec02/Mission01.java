package ch04.sec02;

import  java. util.Scanner;
public class Mission01 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 >");

        /*
        커맨드 창으로 값을 입력받을 것이다.

        점수를 입력해주세요 >

         */
// 만약 스캐너에 스트링 타입으로 들어갔다면 ?
        // 파싱처리해주기
        int Num = scanner.nextInt();
        if (Num >=60) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }



    }
}

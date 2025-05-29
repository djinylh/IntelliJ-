package ch05.sec05;

import java.util.Scanner;
public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("주민번호를 입력하시오 >");
            String a = scanner.next();
            char b = a.charAt(7);
            char c = a.charAt(8);
        /*
        주민번호를 입력하시오 . (xxxxxx-xxxxxxx)

        (만약)주민등록번호 길이가 다르면 "잘목 입력하셨습니다."
        길이가 맞다면 8번째 자리의 값으로 " 여성" "남성" 출력해주세요
        8번째 자리가 1~4가 아니라면 " 잘못 입력하셨습니다"
         */
            if (a.length() >= 15) {

                System.out.println("잘못 입력하셨습니다");

            }

            switch (a.charAt(7)) {
                case '1', '3':
                    System.out.println("남자");
                    run = false;
                    break;
                case '2', '4':
                    System.out.println("여자");
                    run = false;
                    break;
                case '0', '5', '6', '7', '8', '9':
                    System.out.println("잘못 입력하셨습니다");

                    break;
            }
        }

    }
}



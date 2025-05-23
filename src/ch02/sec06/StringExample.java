package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        char ch1 = 'A';
//        char ch2 = ""; or 'aa' 안 됨 [ 문자 타입 / 한개만 저장 가능]

        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        name =job; // 주소값 복사 : 쉘로우 복사(shallow)copy, 얕은 복사



        String str = "나는\"자바\"를 배웁니다";


        System.out.println(str); // 나는 "자바"를 배웁니다.

            String str2 = "나는\t이름\t직업";
        System.out.println(str2);

        String str3 = "나는\n자바를\n배웁니다.";
        System.out.println(str3);

        System.out.printf("%s\n%s\n%s\n", "나는", "자바를", "배웁니다");
        System.out.println("끝");

        System.out.printf("%s - %s - %s\n", 1, true, 12.8);

    }
}

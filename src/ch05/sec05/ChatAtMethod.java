package ch05.sec05;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // 남자 리턴
        String gender2 = checkGender("900212-2998756"); // 여자 리턴
        String gender3 = checkGender("900212-7998756"); // 여자 리턴

        // 8번째 문자에 따라 남자 여자

    }
    public static String checkGender(String num){

        switch (num.charAt(7)){
            case '1', '3':
                System.out.println("남자");
                break;
            case '2','4':
                System.out.println("여자");
                break;
            default:
                System.out.println("null");
                break;
        }
        return num;
    }


}

package ch05.sec05;

import com.sun.jdi.IntegerType;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7);
        System.out.println(gender);



        int a = Character.getNumericValue(gender);

    switch (a) {
        case 1, 3:
            System.out.println("남자");
            break;
        case '2', '4':
            System.out.println("여자");
            break;}
}

    }


package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToint('c');
        printCharToint('가');
        printCharToint('ㅣ');

        int val = getCharToInt('c');
        System.out.println(val);
    }
    static void printCharToint(char c){
        System.out.printf("%c : %d\n" ,c, (int)c);
    }

    public static int getCharToInt(char c){
        return (int)c;
    }
}


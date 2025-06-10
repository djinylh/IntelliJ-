package ch06.sec08;

public class PrimitiveAndRef {
    public static void main(String[] args) {
        int num = 10;

        NumBox numbox = new NumBox();
        numbox.num = 10;


        changeNum(num);
        changeNum(numbox);
        System.out.println(num);
        System.out.println(numbox.num);

    }

    private static void changeNum(int num) {
        num=20;
    }

    private static void changeNum(NumBox numbox){
        numbox.num = 20;
    }
}
class NumBox {
    int num;
}

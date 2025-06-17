package ch15;

public class MyArrayListExample {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        int length = list.size();
        list.checkValues();
        System.out.println("length: " +length);
        list.add("가");
        list.checkValues();
        list.add("나");
        list.checkValues();

        String str = list.get(0);
        System.out.println("str: " + str );
        System.out.println("list.get(1): " + list.get(1) );
        list.add("다");
        list.add("라");
        list.add(2,"크");
        list.checkValues();

        String str2 = list.remove(1);
        list.checkValues();

    }


}

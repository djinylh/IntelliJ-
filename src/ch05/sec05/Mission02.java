package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String filename = "가나다라/haha.jpg";

int result = filename.lastIndexOf(".");

String ext = filename.substring(result+1);
        System.out.println(ext);


    }
}

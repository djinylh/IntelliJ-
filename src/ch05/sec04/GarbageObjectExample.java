package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
//        hobby = null; 여행이 날라감
    String kind1 = "자동차";
    String kind2 = kind1;
    kind1 = null;

    }
}

package ch07.sec07.poly;

public class AnimalExample02 {
    public static void main(String[] args) {
        // 주소값 instanceof 타입
        // 타입이 주소값을 저장할 수 있나?
        // 저장할 수 있으면 true, 없으면 false가 결과가 된다

        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        System.out.println(tiger instanceof  Cat);
        Cat cat = tiger;


        System.out.println(cat instanceof Tiger); //

        Tiger tiger2 = (Tiger) cat;

        System.out.println(tiger2 instanceof Animal);


    }
}

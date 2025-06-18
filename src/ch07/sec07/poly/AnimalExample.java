package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        BullDog bullDog = new BullDog();
        Dog dog = new Dog();



        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bullDog);
        // 불독은 월~ 월~
        // 불독이 쩜프한다.
    }
    //static 유무차이 알아보기
    public static void animalCrying(Animal animal){
    animal.crying();
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.jump();
        }


    // Dog 객체 넘어오면 jump 메소드 호출
    // 1. jump 메소드를 호출하려면 타입이 dog가 되어야한다.
        // 2. Dog 객체가 들어왔을 때만 Dog타입으로 형변환을 해야한다


    }


}

package ch07.sec07.polly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
    }
    //static 유무차이 알아보기
    public static void animalCrying(Animal animal){
    animal.crying();
    }


}

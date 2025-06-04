package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    //오버로딩(Overloading) 똑같은 이름의 메소드를 여러개 만들 수 있따 .
    public Car() {}
    public Car(boolean bbb, int ccc, String aaa){}

public  Car(String model, boolean start, int speed) {
    this.model=model;
    this.start =start;
    this.speed = speed;

}
}

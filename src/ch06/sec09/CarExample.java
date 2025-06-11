package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        //모델명이 포르쉐 벤츠 차 2개 객체 생성
        Car car = new Car("포르쉐");
        Car car1 = new Car("벤츠");

        car.run();
        car1.run();



    }
}

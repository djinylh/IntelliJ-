package ch08.sec11.exam02;

import ch08.control.legacy.HarmanSpeaker;

public class DriverExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);

        //Vehicle  인터페이스를 implements한 객체의 주소값이 vehicle변수에 들어간다.
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {

            }

            @Override
            public void stop() {

            }
        };

    }

}

package ch08.control.ioc;

import ch08.control.Tv;

public class Test {
    public static void main(String[] args) {


        TvFactory tvFactory = TvFactory.getInstance();

    Tv tv = tvFactory.factory(args[0],args[1]);
    tv.sound();

    }
}

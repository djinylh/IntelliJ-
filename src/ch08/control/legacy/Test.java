package ch08.control.legacy;

import ch08.control.Speaker;
import ch08.control.Tv;

public class Test {
    public static void main(String[] args) {
        Speaker speaker = new HarmanSpeaker();
        speaker.speakerSound();

        Speaker speaker2 = new JBLSpeaker();
        speaker2.speakerSound();

        System.out.println("---");
        Tv tv = new SamsungTv();
        tv.sound();

    }
}

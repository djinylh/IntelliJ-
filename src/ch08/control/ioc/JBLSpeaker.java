package ch08.control.ioc;

import ch08.control.MartenWoofer;
import ch08.control.Speaker;
import ch08.control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(Woofer woofer){

        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 깔끔하다");
        this.woofer.baseSound();

    }
}

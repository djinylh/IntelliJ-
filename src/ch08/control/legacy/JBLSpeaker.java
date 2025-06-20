package ch08.control.legacy;

import ch08.control.MartenWoofer;
import ch08.control.Speaker;
import ch08.control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(){
        this.woofer = new MartenWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 깔끔하다");
        this.woofer.baseSound();

    }
}

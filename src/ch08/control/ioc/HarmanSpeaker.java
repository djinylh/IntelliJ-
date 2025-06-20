package ch08.control.ioc;

import ch08.control.GenelecWoofer;
import ch08.control.Speaker;
import ch08.control.Woofer;

public class HarmanSpeaker implements Speaker{

    private Woofer woofer;
    //하만 스피커가 객체화 된다면 제네렉우퍼를 사용할 수 있도록 해주세요




    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요.");
        woofer.baseSound();

    }

    public HarmanSpeaker(Woofer woofer) {

        this.woofer= woofer;
    }

}

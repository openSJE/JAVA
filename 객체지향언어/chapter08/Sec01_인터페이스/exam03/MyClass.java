package chapter08.Sec01.exam03;

import chapter08.Sec01.exam02.RemoteControl;

/**
 * packageName : chapter08.Sec01.exam03
 * fileName : MyClass
 * author : ds
 * date : 2022-09-30
 * description : 내 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class MyClass {
    RemoteControl remoteControl;

    public MyClass(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
        // 리모컨 켜기
        remoteControl.turnOn();
        //리모컨 조절 기능
        remoteControl.setVolume(5);
    }
}

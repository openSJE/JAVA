package chapter08.Sec01.exam02;

/**
 * packageName : chapter08.Sec01.exam02
 * fileName : SmartTelevisionApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class SmartTelevisionApplication {
    public static void main(String[] args) {
        SmartTelevision smartTelevision = new SmartTelevision();

        Searchable searchable = smartTelevision;
        RemoteControl rc = smartTelevision;
//        스마트 tv 기능 이용하기
        rc.turnOn();
        rc.setVolume(9);
        searchable.search("www.naver.com");
        rc.turnOff();

    }
}
package chapter08.Sec01.exam02;

/**
 * packageName : chapter08.Sec01.exam02
 * fileName : SmartTelevision
 * author : ds
 * date : 2022-09-30
 * description : 검색 기능이 있는 텔레비전
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class SmartTelevision implements RemoteControl, Searchable{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("스마트 tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 tv를 끕니다");
    }


    @Override
    public void setVolume(int volumn) {
        this.volume = volume;
        if(volume>MAX_VOLUMN) {
            volume = 10;
        }
        if(volume<MIN_VOLUMN) {
            volume = 1;
        }

        System.out.println("현재 smartTV불륨 : " + volume);

    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}

package chapter07.Sec2.exam03;

/**
 * packageName : chapter07.Sec2.exam03
 * fileName : Taxi
 * author : ds
 * date : 2022-09-29
 * description : 자식클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Taxi extends Vehicle{

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

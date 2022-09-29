package chapter07.Sec1.exam06;

/**
 * packageName : chapter07.Sec1.exam06
 * fileName : Car
 * author : ds
 * date : 2022-09-29
 * description : final함수, 부모클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Car {
    public int speed;
    
    // 속도 증가 함수
    public void speedUp(){
        speed += 1;
    }

    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}

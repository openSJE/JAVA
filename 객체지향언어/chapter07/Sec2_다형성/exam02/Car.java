package chapter07.Sec2.exam02;

/**
 * packageName : chapter07.Sec2.exam02
 * fileName : Car
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Car {

    //속성 (==필드 ==멤버변수)
    // 자동차의 네가지 타이어
    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 4);

    //생성자

    //메소드(함수)
    // 자동차 운전함수
    int run() {
        System.out.println("[자동차가 달립니다.]");
        // .roll() 함수 호출 : 리턴값이 false 이면 타이어 펑크, 아니면 운전 가능
        if(frontLeftTire.roll()==false) { stop(); return 1; }; // 1번타이어
        if(frontRightTire.roll()==false) { stop(); return 2; }; // 2번타이어
        if(backLeftTire.roll()==false) { stop(); return 3; }; // 3번타이어
        if(backRightTire.roll()==false) { stop(); return 4; }; // 4번타이어
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }

}

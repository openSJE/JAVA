package chapter07.Sec1.exam04;

/**
 * packageName : chapter07.Sec1.exam04
 * fileName : Airplane
 * author : ds
 * date : 2022-09-29
 * description : 부모클래스의 함수호출(super.함수()), 부모클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Airplane {
    // 비행기 착률 함수
    public void land(){
        System.out.println("착륙합니다.");
    }

    // 비행기 이륙 함수
    public void takeOff(){
        System.out.println("이륙합니다.");
    }

    // 비행 함수
    public void fly(){
        System.out.println("일반비행합니다.");
    }

}

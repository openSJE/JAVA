package chapter07.Sec1.exam04;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * packageName : chapter07.Sec1.exam04
 * fileName : SuperSonicAirplane
 * author : ds
 * date : 2022-09-29
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class SuperSonicAirplane extends Airplane{
    
    // 공유 상수 : 무조건 값을 바로 지정
    public static final int NORMAR = 1;
    public static final int SUPERSONIC = 2;

    // 속성
    public int flyMode = NORMAR;

    // 함수 재정의 fly()


    @Override
    public void fly() {
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else{
            // 아니면 일반 비행합니다. 출력
            super.fly(); // 부모클래스의 함수 호출("일반비행합니다." 출력)
        }
    }
}

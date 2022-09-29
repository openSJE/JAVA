package chapter07.Sec1.exam04;

/**
 * packageName : chapter07.Sec1.exam04
 * fileName : AirplaneApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class AirplaneApplication {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();
        
        // 비행기 이륙
        superSonicAirplane.takeOff(); // 부모 이륙함수
        superSonicAirplane.fly(); // 부모 비행함수
        // 공유상수 호출하는 방법 : 클래스.공유상수명
        // 비행모드 : 초음속 변경
        superSonicAirplane.flyMode = superSonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.land(); // 부모 착륙 함수 호출
    }
}

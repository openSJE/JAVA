package chapter06.Sec05.exam06;

/**
 * packageName : chapter06.Sec05.exam06
 * fileName : EarthApplication
 * author : ds
 * date : 2022-09-28
 * description : 공유함수
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class EarthApplication {
    public static void main(String[] args) {
        System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적 : " + Earth.EARTH_AREA + "km^2");
    }
}

package chapter06.Sec05.exam06;

/**
 * packageName : chapter06.Sec05.exam06
 * fileName : Earth
 * author : ds
 * date : 2022-09-28
 * description : 공유 상수(static final)
 * 명명 규칙 : 디문자
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Earth {
    // 지구의 반지름
    static final double EARTH_RADIUS = 6400;

    //지구의 표면적
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS;
}

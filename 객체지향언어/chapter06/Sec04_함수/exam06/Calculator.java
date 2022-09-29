package chapter06.Sec04.exam06;

/**
 * packageName : chapter06.Sec04.exam06
 * fileName : Calculator
 * author : ds
 * date : 2022-09-28
 * description : 정사각형 / 직사각형의 면적을 구하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Calculator {

    int width;
    int height;

    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }



}

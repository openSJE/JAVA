package chapter06.Sec04.exam06;

/**
 * packageName : chapter06.Sec04.exam06
 * fileName : CalculatorApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 정사각형의 넓이 구하기
        double result1 = calculator.areaRectangle(10);

        // 직사각형 넓이 구하기
        double result2 = calculator.areaRectangle(10, 20);

        // 결과 출력
        System.out.println("정사각형 넓이 " + result1);
        System.out.println("직사각형 넓이 " + result2);
    }
}

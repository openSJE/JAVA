package chapter07.Sec1.exam03;

/**
 * packageName : chapter07.Sec1.exam03
 * fileName : CalculatorApplication
 * author : ds
 * date : 2022-09-29
 * description : 실행 클래스(main())
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        // 부모 객체 생성
        Calculator calculator = new Calculator();
        // 반지름 지정
        int r= 10;
        // 원의 면적
        System.out.println("원면적 : " + calculator.areaCircle(r));

        //자식객체 생성
        Computer computer = new Computer();
        // 원의 면적 출력( 재정의된 함수가 실행됨 )
        System.out.println("원면적 : " + computer.areaCircle(r));

    }
}

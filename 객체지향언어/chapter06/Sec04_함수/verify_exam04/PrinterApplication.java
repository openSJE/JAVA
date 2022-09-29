package chapter06.Sec04.verify_exam04;

/**
 * packageName : chapter06.Sec04.verify_exam04
 * fileName : PrinterApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
// 결과 :
    //   공유함수(int) : 10
    //   공유함수(boolean) : true
    //   공유함수(double) : 5.7
    //   공유함수(String) : 홍길동
public class PrinterApplication {
    public static void main(String[] args) {
        // 공유함수 오버로딩 예제
        // 공유변수 호출하는 방법
        // 사용법 : 클래스명.공유함수명();
        
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}

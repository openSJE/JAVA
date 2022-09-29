package chapter06.Sec04.verify_exam04;

/**
 * packageName : chapter06.Sec04.verify_exam04
 * fileName : Printer
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Printer {
    // 공유(== 전역 == 정적) 함수
    static void println(int value) {
        System.out.println("공유함수(int) :" + value);
    }
    static void println(boolean value) {
        System.out.println("공유함수(boolean) :" + value);
    }
    static void println(double value) {
        System.out.println("공유함수(double) :" + value);
    }
    static void println(String value) {
        System.out.println("공유함수(String) :" + value);
    }

    //
}

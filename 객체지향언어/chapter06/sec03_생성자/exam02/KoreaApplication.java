package chapter06.sec03.exam02;

/**
 * packageName : chapter06.sec03.exam02
 * fileName : KoreaApplication
 * author : ds
 * date : 2022-09-27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class KoreaApplication {
    public static void main(String[] args) {
        //      한국인 객체를 생성
        // 매개변수 2개짜리 생성자를 이용해서 속성을 초기화 하세요.
        // 초기화 한 결과를 출력하세요.
        // 결과 :
        //     k1.name : 박자바
        //     k1.ssn  : 011225-1234567
        //     k2.ssn  : 930525-0654321

        Korea k1 = new Korea("박자바","011225-1234567");
        Korea k2 = new Korea("김자바","930525-0654321");

        System.out.println("k1.name: " + k1.name);
        System.out.println("k1.ssn: " + k1.ssn);
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn: " + k2.ssn);
    }
}

package chapter07.Sec1.exam02;

/**
 * packageName : chapter06.Sec07.exam02
 * fileName : People(부모클래스)
 * author : ds
 * date : 2022-09-29
 * description : super 예제
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class People {
    public String name;
    public String snn; // 주민번호

    public People(String name, String snn) {
        this.name = name;
        this.snn = snn;
    }
}

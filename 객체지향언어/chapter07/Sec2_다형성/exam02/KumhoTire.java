package chapter07.Sec2.exam02;

/**
 * packageName : chapter07.Sec2.exam02
 * fileName : KumhoTire
 * author : ds
 * date : 2022-09-29
 * description : 자식 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class KumhoTire extends Tire{


    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    // 재정의 함수 : tire -> Kumhotire 수정
    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " KumhoTire 펑크 ***");
            return false;
        }
    }
}

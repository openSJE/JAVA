package chapter07.Sec1.exam06;

/**
 * packageName : chapter07.Sec1.exam06
 * fileName : SportsCar
 * author : ds
 * date : 2022-09-29
 * description : 자식클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class SportsCar extends Car{
    
    @Override
    public void speedUp() {
        speed += 10;
    }
    
    // final 붙은 부모 함수는 재정의 할 수 없음 : stop()
}

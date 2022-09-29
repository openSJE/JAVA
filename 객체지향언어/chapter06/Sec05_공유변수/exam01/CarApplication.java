package chapter06.Sec05.exam01;

/**
 * packageName : chapter06.Sec05.exam01
 * fileName : CarApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car("포르쉐");
        Car car2 = new Car("벤츠");


        car.run(); // 반복문 출력
        car2.run();
        car.setModel("미니쿠퍼");
    }
}

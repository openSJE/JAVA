package chapter06.Sec04.exam05;

import chapter06.Sec04.exam05.Car;

/**
 * packageName : chapter06.Sec04.exam05
 * fileName : CarApplicaiton
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
// 결과 :
    //  키를 돌립니다.
    //  달립니다.(시속:10km/h)
    //  달립니다.(시속:20km/h)
    //  달립니다.(시속:30km/h)
    //  달립니다.(시속:40km/h)
    //  달립니다.(시속:50km/h)
    //  현재속도 :  50km/h
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();
        car.keyTurnOn(); // 키를 돌립니다.
        car.run(); // 달립니다.
        int speed = car.getSpeed(); // 현재 속도 값을 리턴
        System.out.println("현재속도:" + speed + "km/h");
    }
}

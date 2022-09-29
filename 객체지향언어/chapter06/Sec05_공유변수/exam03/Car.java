package chapter06.Sec05.exam03;

/**
 * packageName : chapter06.Sec05.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
// 예제 : 공유변수(함수) 쓸 때의 주의점
public class Car {
    int speed; // 속성

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    // 공유함수
    public static void main(String[] args) {
        // this.speed = 68; // 일반속성(함수) 바로 사용할 수 없음. 에러 발생
        // this. 사용못함
        // 같은 클래스라도 객체를 생성해서 사용해야함
        Car car = new Car();
        car.speed = 60;
        car.run();
    }
}

package chapter07.Sec2.exam02;

/**
 * packageName : chapter07.Sec2.exam02
 * fileName : CarApplication
 * author : ds
 * date : 2022-09-29
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car car = new Car();
        // .run 5번 실행
        for (int i = 0; i < 5; i++) {
            int problemLocation = car.run(); // 자동차 주행함수실행

            // 조건문 problemLocation 체크 (0 - 4)
            switch (problemLocation){
                // 1 - 4 값 : 타이어 평크
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    // 다형성을 이용한 객체 교체
                    car.frontLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    // 다형성을 이용한 객체 교체
                    car.frontRightTire = new KumhoTire("앞오른쪽", 15);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    // 다형성을 이용한 객체 교체\
                    car.backLeftTire = new HankookTire("뒤왼쪽", 15);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체");
                    // 다형성을 이용한 객체 교체
                    car.backRightTire = new KumhoTire("뒤오른쪽", 15);
                    break;
            }
            System.out.println("🚗💨🚓💨🚕💨🛺💨🚙💨🚌💨🚐💨🚎💨🚑💨🚒💨🚛💨");
        }
    }
}

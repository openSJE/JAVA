package chapter06.Sec04.exam05;

/**
 * packageName : chapter06.Sec04.exam05
 * fileName : Car
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Car {

    int speed;

//    void keyTurnOn(int speed) {
//        this.speed = speed;
//    }
//
//    int run(){
//        while(true){
//            if (speed < 60) {
//                System.out.println("달립니다. (시속:"+speed+")");
//                speed += 10;
//            }else if (speed >= 60){
//                break;
//            }
//        }
//        return 0;
//    }
//
//    void getSpeed() {
//        int result = speed;
//    }
//
//

    
    int getSpeed() {
        return speed;
    }
    
    // 키를 돌립니다.
    void keyTurnOn(){
        System.out.println("키를 돌립니다.");
    }
    
    // 반복문을 이용해서 출력하는 함수
    // 달립니다. (시속 _+ speed + km/h)
    void run() {
         speed = 10;
         while(true) {
             if (speed < 60) {
                 System.out.println("달립니다. (시속:" + speed + ")");
                 speed += 10;
             } else if (speed >= 60) {
                 break;
             }
         }
    }

}

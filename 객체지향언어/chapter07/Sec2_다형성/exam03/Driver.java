package chapter07.Sec2.exam03;

/**
 * packageName : chapter07.Sec2.exam03
 * fileName : Driver
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Driver {
    
    // 운전함수
    // 매개변수 vehicle (부모 클래스)
    // 다형성 : 자식객체(bus,taxi) 2개 중에 1개를 전달하면
    // Bus 객체를 전달하면 Bus.run() 실행 (재정의된 함수)
    // Taxi 객체를 전달하면 Taxi.run() 실행 (재정의된 함수)
    public void drive(Vehicle vehicle){
        vehicle.run(); // 형태는 부모클래스의 run()
    }}

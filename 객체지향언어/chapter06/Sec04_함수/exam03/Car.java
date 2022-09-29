package chapter06.Sec04.exam03;

/**
 * packageName : chapter06.Sec04.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
    // gas 체크해서 차가 출발을 합니다.
    // gas 있으면 "출발합니다." 출력하고,
    // 차를.run() 실행 // gas--; 감소시킴 반복문 종료
    // 다시 gas > 0 인지 확인해서 "gas를 주입할 필요가 없습니다."
    // 아니면 "gas를 주입하세요."
public class Car {
    int gas;
    
    // gas의 속성을 저장하는 함수
    void setGas(int gas) {
        this.gas = gas;
    }
    
    // 문제 1)
    boolean isLeftGas() {
        // 조건문 gas == 0 이면 gas가있습니다. return false;
        // 없으면 gas가 없습니다. return true;
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        } else{
            System.out.println("gas가 있습니다.");
            return true;
        }
    }
    
    // 문제 2)
    void run(){
        while(true){
            // 조건문 체크 : gas>0 "달립니다.(gas잔량: 5) 출력, fas--;
            //             아니면 "멈춥니다.(gs잔량:0)" 출력, 반복문 종료
            if (gas > 0) {
                System.out.println("달립니다. (gas 잔량:"+gas+")");
                gas--;
            }else{
                System.out.println("멈춥니다. (gas 잔량:0)");
                break;
            }
    }
}
}

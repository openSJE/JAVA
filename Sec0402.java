package chapter04;

/**
 * packageName : chapter04
 * fileName : Sec0402
 * author : ds
 * date : 2022-09-26
 * description : 반복문
 * 요약:
 *     for문 : for(초기화식; 조건식; 증감식){반복문}
 *     조건식이 true일 때만 반복문 실행됨
 *     while문 : 
 *              초기화식
 *              while(조건식){
 *                  반복문;
 *                  증감식;
 *              }
 *     조건식이 true일 때만 반복문 실행됨
 *     do{반복문} while문 : do{반복문}while(조건식);
 *     최초 1번은 반복문이 실행되고 그 다음에 조건식이 true아닌지 판단함.
 *     break : 반복문 강제중단
 *     continue : 아래 라인 실행 안하고, 증감식 또는 조건식으로 강제 이동
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Sec0402 {
    // 1부터 100까지의 합을 출력하기 : for문
    // for(int 변수=초기값; 조건식; 증감식;){반복문}
    // 결과 : 5050

    public void exam03() {
        int sum = 0;

//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }

        int i = 0; // 변수의 적용범위
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("합 : " + sum);
    }

    // 반복문을 실수로 반복하기
    // 실수로 반복문을 실행하는 것은 가능하나 결과에 오차가 생길 수 있음 (권고하지 않음)
    // 현대 코딩언어 : 부동소수점 법을 사용 (장점: 실수를 엄청 많이 사용할 수 있음, 단점: 오차 발생)
    //               고정소수점 법을 사용 (장점: 정확도 높음, 단점: 실수를 많이 표현 못함)
    public void exam() {
//        for(float x=0.1f; x<=1.0; x+=0.1f){
//            System.out.println(x);
//        }


        // 자바언어로 구구단 출력하기
        // 2단 ~ 9단
        // 중첩 for문
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j + " ");
            }
        }
    }
    // java 반복문 형태
    // 1) for문
    // 2) while문
    // 3) do-while문


    public void exam07() {
        // 2) while문 / for문을 while문으로 고치기
        // 결과 합: 5050

        int i = 0;
        int sum = 0;
        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println("합 : " + sum);
    }

    // 3) do while문
    // 먼저 반복문 1번 실행 후 조건식 검사
    public void exam08() {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while (i<=100);
        System.out.println("합 : " + sum);
    }
    
    // break : 반복문 강제 빠져나오기
    public void exam09() {
//        1-6까지 정수를 뽑아서 출력하고
//        만약 6이 나오면 break로 중단하고 나오는 프로그램을 코딩하세요.
        while (true){
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);
            if(num == 6){
                break;
            };
        }
        }
        // 1-10 사이의 수 중 짝수만 출력하는 코드 continue문
    // continue : 아래 라인 실행 무시하고 for문의 조건식으로 강제이동
    public void exam10() {
        for (int i=0; i<=10; i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }

    // 자바 8에서 새로나온 문법
    // 반복문 사용하는 라벨
    // 2중 Loop에서 바깥쪽 for문 'A' - 'Z' 반복하고,
    //             안쪽 for문 'a' - 'z' 반복함
    //             안쪽 for문에서 소문자 'g' 나오면 break; 반복문 중단하고 싶음
    //             안쪽 for문만 중단, 바깥쪽 for문은 중단되지 않음.
    // 양쪽 다 중단시키기 위해 라벨을 붙이면 그쪽까지 중단가능 : break 라벨명
    public void exam11(){
        Outter:
            for (char upper='A'; upper<='Z'; upper++){
                for(char lower='a'; lower<='z'; lower++){
                    System.out.println(upper + "-" + lower);
                    if(lower == 'g'){
                        break Outter;
                    }
                }
            }
        System.out.println("프로그래밍 종료");
    }
    }


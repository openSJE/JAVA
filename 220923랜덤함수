package chapter04;

/**
 * packageName : chapter04
 * fileName : Sec0401
 * author : ds
 * date : 2022-09-23
 * description : 조건문
 * 요약 :
 *      if문 - if(조건식1){실행문}/else if(조건식2){실행문2)/else{실행문3}
 *      조건식 1..2 까지 각각 true/ false 인지 판단해서 실행할지 결정
 *      switch 문 - switch(변수) {case 값1 : 실행문1 case값2... default: 실행문n}
 *      변수의 값을 판단해서 변수값이 값1이면 실행문1이 실행... 모두 아니면 default 실행
 *      사용시 실행문 실행하고 break; 빠져나와야 함
 *      * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-23         ds          최초 생성
 */
public class Sec0401 {
    public void  exam01() {
        int score = 93;

        // score >= 98 이면 점수가 98보다 큽니다.
        // 등급은 A입니다.

        // score < 98 이면 점수가 98보다 작습니다.
        // 등급은 B입니다.

        if(score >= 98) {
            System.out.println("점수가 98보다 큽니다.");
        }else{
            System.out.println("점수가 98보다 작습니다.");
        }
    }
    public void exam02() {
        // 랜덤 함수 : 0-1 사이의 아무 실수로 봅기
        // 1 - 7 미만 정수
        // if(){}/else if(){}/else{}
        // 1-10 미만의 랜덤숫자 : (Math.random()*9) + 1;
        // 랜덤 함수 : 0 <= X < 1 실수 (소수점 포함)
        // 1 - 10 까지의 정수를 뽑기
        // 1) 0.0 < = Math.random() < 1.0
        // 2) 0.0 * 10 <= Math.random() *10 < 1.0*10
        // 3) (int)0.0 <= (Math.random() * 10) < (int)10.0
        // 4) 0 + 1 <= (int)(Math.random() * 6) +1
        // 공식 : int num = (int)(Math.random() * end) + start
        int num = (int)(Math.random()*6)+1;
        // num == 1 이면 1번 출력
        // num == 2 이면 2번 출력
        // num == 3 이면 3번 출력
        // num == 4 이면 4번 출력
        // num == 5 이면 5번 출력
        // num == 6 이면 6번 출력

        if(num==1){
            System.out.println("1번");
        }else if(num==2){
            System.out.println("2번");
        }else if(num==3) {
            System.out.println("3번");
        }else if(num==4) {
            System.out.println("4번");
        }else if(num==5) {
            System.out.println("5번");
        }else if(num==6) {
            System.out.println("6번");
        }
    }

    // 랜덤 함수 응용
    public void exam06() {
        // 8- 11 까지의 정수 얻기
        // 8이면 "출근합니다."
        // 9이면 "회의를 합니다."
        // 10이면 "업무를 봅니다."
        // 나머지는 "외근을 나갑니다."
        int num2 = (int)(Math.random()*4)+8;
        int time = (int)(Math.random()*4)+8;
        // 1) if문(조건식)
        if (num2==8){
            System.out.println("출근합니다.");
        }else if(num2==9){
            System.out.println("회의를 합니다.");
        }else if(num2==10){
            System.out.println("업무를 봅니다.");
        }else{
            System.out.println("외근을 나갑니다.");
        }
        // 2) switch = case문 사용
        // switch(변수) : 변수의 값을 조사해서 각각 상황(case 값(상수))에 일치하는 조건문이 실행됨
        // 문법 : switch(변수) {
        //         case 값1 :
        //              실행문;
        //              break; // 강제종료됨
        //         case 값2 : ...
        //         default :
        //              실행문;
        //              break; // 강제종료됨
        // }
        switch(time){
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의를 합니다.");
                break;
            case 10:
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
        }
    }


//    public void eat() {
//        // 8- 11 까지의 정수 얻기
//        // 8이면 "출근합니다."
//        // 9이면 "회의를 합니다."
//        // 10이면 "업무를 봅니다."
//        // 나머지는 "외근을 나갑니다."
//        int num2 = (int)(Math.random()*5)+1;
//        if (num2==1){
//            System.out.println("연어 샐러드");
//        }else if(num2==2){
//            System.out.println("닭다리살 샐러드");
//        }else if(num2==3){
//            System.out.println("닭가슴살 샐러드");
//        }else if(num2==4){
//            System.out.println("남도분식");
//        }else if(num2==5){
//            System.out.println("도훈의선택");
//        }
//    }

    // CHAR 자료형 변수를 이용해서 'A' 또는 'a'면 "우수회원입니다."
    //                         'B' 또는 'b' 면 "일반회원입니다."
    public void exam07() {
        char grade = 'B';
        //switch 문
        switch (grade){
            case 'A': case'a' :
                System.out.println("우수회원입니다.");
                break;
            case 'B': case'b':
                System.out.println("일반회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
                break;
        }

    }
}

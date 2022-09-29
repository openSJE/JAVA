package chapter07.Sec2.exam01;

/**
 * packageName : chapter07.Sec2.exam01
 * fileName : ChildApplication
 * author : ds
 * date : 2022-09-29
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
        // 자식 클래스 객체 생성
        Child child = new Child();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        // 다형성(상속관계) : 사용 방법은 동일하지만 다양한 객체를 이용해서 다양한 실행결과가 나오도록 하는 것
        // 자동 타입 변환 : 부모객체 = 자식객체
        // 부모객체.함수(); -> 재정의한 함수 자식객체 있을 경우 재정의한 함수가 호출됨
        // 다형성 장점 :
        // 예) 자동차 타이어를 끼워넣는 방법은 일정하지만 어떤 타이어를 넣느냐에 따라서 주행속도가 달라짐.
        // 다형성 구현 조건 : 함수 재정의 + 타입변환(형변환)
        Parent parent = child3; // 연산자 byte -> int, 자동 타입변환

        parent.method1(); // 부모함수 호출

        parent.method2(); // 재정의한 자식함수 호출

//        parent.method3(); // 다형성으로 이루어진 객체는 자식 객체의 고유 함수를 사용못함(에러발생)
    }
}

package chapter07.Sec1.exam03;

/**
 * packageName : chapter07.Sec1.exam03
 * fileName : Computer
 * author : ds
 * date : 2022-09-29
 * description : 자식 클래스 (함수 재정의(오버라이딩 overriding))
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Computer extends Calculator{

    // 함수 재정의 : 3.14가 마음에 안듦(pi값 정확성 높이고 싶음)
    // Math.PI
    // 함수 재정의 하면 자신의 함수가 실행됨(부모 함수 무시)
    // @Override : 오버라이딩 된 함수임을 표시, 
    // 부모함수 선언부 == 자식함수 선언부(이름부분) 일치하지 않으면 아래, 이노테이션 에러를 발생시킴(오타 등 제거)
//    @Override
//    double areaCircle(double r){
//        System.out.println("Calculator 객체의 areaCircle() 함수 사용");
//        return Math.PI * r * r;
//    }


    // 오버라이딩 : alt + insert -> 함수 재정의
    // 오타방지
    @Override
    double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 함수 사용");
        return Math.PI * r * r;}
}

package chapter06.sec03.exam03;

/**
 * packageName : chapter06.sec03.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-27
 * description : 생성자 매개변수
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class Car {
    // 속성
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 객체 지향 언어 제공하는 기능 :
    // (생성자) 오버로딩 : 일반적으로 함수명이 같으면 에러가 발생
    //           단, 매개변수 타입(자료형), 개수가 다르다면 허용
    
    // 기본 생성자 : 자바에서 자동 만들어주는 대상 (생성자 없을 경우)
    // this() : 생성자를 호출할 수 있음
    // this() == Car()
    // this("현대자동차") == Car("현대자동차")
    // this("현대자동차","검정")


    public Car() {
    }

    public Car(String model) {
//        this.model = model;
        this(model, null, 0);
    }

    public Car(String model, String color) {
//        this.model = model;
//        this.color = color;
//        매개변수 3개짜리 생성자 함수를 재사용 : 코드 중복 제거
        this(model, color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        // this : 객체 자기자신(Car객체)
        // this.속성명 = 매개변수명;
        // 인텔리제이 자동화툴 이용 : 생성자만들기 (alt + insert -> 생성자 메뉴 선택)

        // 생성자의 매개변수명 == 속성의 이름이 같은 경우 사용.
        // this.속성명 = 매개변수명;
        // this : 자기자신 의미하는 객체변수(객체 자기자신 Car)
        // 클래스 내부에만 사용가능, 다른 클래스에서는 사용 못함
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }



}

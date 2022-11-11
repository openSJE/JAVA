package chapter08.Sec01.exam03;

import chapter08.Sec01.exam02.RemoteControl;

/**
 * packageName : chapter08.Sec01.exam03
 * fileName : MyClassApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class MyClassApplication {
    public static void main(String[] args) {
        MyClass myClass = new MyClass((RemoteControl) new Television());

        System.out.println("^_______________________^");
        myClass = new MyClass((RemoteControl) new Audio());
    }
}

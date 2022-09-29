package chapter07.Sec1.exam02;

/**
 * packageName : chapter07.Sec1.exam02
 * fileName : Student
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Student extends People{
    public int studentNo;

    // 상속관계 : 부모객체 - 자식객체
    // new 객체를 만들때 생성자를 호출 순위 : 1) 부모생성자, 2)자식생성자
    public Student(String name, String snn, int studentNo) {
        super(name, snn); // super(매개변수값, 매개변수값) : 부모의 생성자를 호출하는 함수
        this.studentNo = studentNo; // 자기 속성 초기값 지정
    }
}

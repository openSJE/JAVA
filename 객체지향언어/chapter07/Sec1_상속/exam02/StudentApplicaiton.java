package chapter07.Sec1.exam02;

/**
 * packageName : chapter07.Sec1.exam02
 * fileName : StudentApplicaiton
 * author : ds
 * date : 2022-09-29
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class StudentApplicaiton {
    public static void main(String[] args) {
        Student student = new Student("홍길동","123456-1234567",1);

        System.out.println("Name : " + student.name); // 부모 속성 출력
        System.out.println("snn : " + student.snn); // 부모 속성 출력
        System.out.println("studentNo : " + student.studentNo); // 자기 속성 출력
    }
}

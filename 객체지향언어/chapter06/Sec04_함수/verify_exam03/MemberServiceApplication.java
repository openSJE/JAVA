package chapter06.Sec04.verify_exam03;

/**
 * packageName : chapter06.Sec04.verify_exam03
 * fileName : MemberServiceApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
// 1) 클래스 만들기
public class MemberServiceApplication {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();

        boolean result = memberService.login("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }

    }
}

package chapter06.Sec04.exam2;

/**
 * packageName : chapter06.Sec04.exam2
 * fileName : ComputerApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
        Compuber compuber = new Compuber();

        // 배열 정의
        int[] value1 = {1,2,3};
        // 리턴값이 있는 함수
        int result1 = compuber.sum1(value1);
        System.out.println("result1 = " + result1);

        // 2)
        int[] value2 = new int[]{1,2,3,4,5};
        int result2 = compuber.sum1(value2);
        System.out.println("result2 = " + result2);

        // 곱하기
        int[] value3 = {2,5,7};
        int result3 = compuber.multi(value3);
        System.out.println("result3 = " + result3);

        // 4) 새로운 /// 함수 호출
        int result4 = compuber.sum2(1,2,3);
        System.out.println("result4 = " + result4);

        int result5 = compuber.sum2(1,2,3,4,5);
        System.out.println("result5 = " + result5);

    }
}

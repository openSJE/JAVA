package chapter06.Sec04.exam2;

/**
 * packageName : chapter06.Sec04.exam2
 * fileName : Compuber
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Compuber {
    // 매개변수 : 배열 전달하는 함수
    // 실무에서 함수 설계 할 때, 현재 매개변수 2개만 사용 -> 나중에 몇개 쓸 지 모름(고객 요구사항에 따라 다름)
    // 해걸책 : 매개변수를 배열로 만듦
    //
    // 모든 매개변수 값을 더하는 함수
    int sum1(int[] value) {
        int sum = 0;
        // 매개변수 배열의 개수까지 모두 더하는 로직
        for(int i=0; i<value.length; i++){
            sum = sum + value[i];
        }
        return sum;
    }

    // 2) 곱하기 함수 만들기
    int multi(int[] value){
        int sum2 = 1;
        for(int i=0; i<value.length; i++){
            sum2 = sum2 * value[i];
        }
        return sum2;
    }

    // 자바의 새로운 문법
    // 매개변수 더하기 함수2
    // ... : 매개변수 배열 형태를 자동으로 만들어주는 연산자
    int sum2(int ... values){
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum = sum + values[i];
        }
        return sum;
    }
}

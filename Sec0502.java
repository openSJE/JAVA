package chapter05;

/**
 * packageName : chapter05
 * fileName : Sec0502
 * author : ds
 * date : 2022-09-26
 * description : 배열
 * 요약 :
 *     배열 : 같은 자료형의 데이터를 연속된 공간에 저장, 내부적으로 인덱스 번호가 부여됨
 *     인덱스 : 0 - n 까지 부여된 숫자
 *     배열 선언 : 자료형[] 변수;
 *     배열 생성 : 1) 자료형[] 변수 = {값1,...값n};
 *               2) 자료형[] 변수 = new 자료형{값1,... 값n};
 *               3) (*)자료형[] 변수 = new 자료형[길이];
 *                  변수[0] = 값1;
 *                  ...
 *                  변수[n] = 값n;
 *      배열 길이 : 배열변수.length (읽기전용 : 값을 넣을 수 없음)
 *      2차원 배열 : 자료형[][] 변수 = new 자료형[크기][크기];
 *      향상된 for문(증감식 없음. 자동증가) : for(자료형 변수 : 배열변수명) {반복문}
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Sec0502 {
    // 함수정의
    // 1) 배열 정의 및 생성 방법
    public void getStudent() {
        // 배열 (참조자료형)
        // 예제) 10명의 학생의 성적을 저장하여 총합과 평균을 출력하는 프로그램을 작성해봅시다.
        // 자바배열 선언 및 생성 : 자료형[] 변수명 = {값1, ... 값n} // 이 형태를 자주 사용함
        //                      자료형 변수명[] = {값1, ... 값n}
        // 자바배열 주의점 : 1라인으로 사용해야 함
        // ex) int[] score;
        //     score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75}; // 에러발생. 선언과 동시에 값을 넣어야 함.
        int[] score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            // 배열변수명[인덱스번호] 사용
            // 인덱스번호 : 0~n 까지 붙은 숫자
            // 배열의 값을 가져오기 : score[인덱스번호]
            // 배열의 값을 수정하기 : score[인덱스번호] = 10;
            sum = sum + score[i];
        }
        // 평균
        int avg = sum / 10;
        System.out.println("sum = " + sum + ", avg = " + avg);
    }

    // 2) 배열정의 및 생성 방법
    public void ArrayCreateByValueList(){
        // new 연산자도 사용 가능 : 배열도 자바에서는 객체로 취급
        // 2라인 이상으로 코딩 가능
        int[] score = new int[] {83, 90, 87};
//        int[] score;
//        score = new int[] {83, 90, 87};

        // 기본 성적 출력하기
        System.out.println("score[0] : "+score[0]);
        System.out.println("score[1] : "+score[1]);
        System.out.println("score[2] : "+score[2]);

        // 성적 합계
        int sum = 0;
        for (int i=0; i<3; i++){
            sum += score[i];
        }
        System.out.println("총합 : "+sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : "+avg);
    }

    public void ArrayCreateByNew(){
        // 3) 배열 정의 및 생성 방법
        // 초기값을 지정하지 않으면 자동으로 지료형에 해당하는 값으로 저장됨
        // 정수(int) : 0, 실수(double) : 0.0, 문자열(String) : null
        // 사용법 : 자료형[] 배열변수 = new 자료형(배열의 크기);
        // 배열 : 초기 크기를 지정하면 뒤에서 변경 불가 (처음에 여유있게 생성)
        int[] arr1 = new int[3]; // 배열의 값을 저장 할 공간을 3개 만들어 놓기

        // 배열 초기값 출력해보기
        for(int i=0; i<3; i++){
            System.out.println("arr1["+ i +"] : " + arr1[i]);
        }

        // 학생 성적 값을 배열에 넣어 보기
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        
        // 배열 수정값 출력해보기
        for(int i=0; i<3; i++){
            System.out.println("arr1["+ i +"] : " + arr1[i]);
        }

        // 연습문제
        // 1) 실수(double) 배열 arr2를 만들어서 값을 (0.1, 0.2, 0.3) 저장하고 출력하세요.
        double[] arr2 = new double[3];
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for(int i=0; i<3; i++){
            System.out.println("arr2["+ i +"] : " + arr2[i]);
        }

        // 2) 문자열(String) 배열 arr3을 만들어서 값을 ("1월""2월""3월") 저장하고 출력하세요.
        String[] arr3 = new String[3];
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";

        for(int i=0; i<3; i++){
            System.out.println("arr3["+ i +"] : " + arr3[i]);
        }

    }

    public void ArrayCreateByNew2(){
        int[] score = new int[] {83, 90, 87};
//        int[] score2 = new int[] {83, 90, 87, 88, 89};
//        int[] score;
//        score = new int[] {83, 90, 87};

        // 기본 성적 출력하기
        System.out.println("score[0] : "+score[0]);
        System.out.println("score[1] : "+score[1]);
        System.out.println("score[2] : "+score[2]);

        // 합계 계산용 합수 호출 : add()
        int sum2 = add(score);
        // 매개변수로 배열을 전달할 때 아래같이 사용하면 에러 발생
        // int sum2 = add({87, 88, 89}); // 에러발생
        // 아래는 가능 (참고)
        // int sum2 = add(new int[]{93, 90,87});

        System.out.println("총합 : "+sum2);
        double avg = (double) sum2 / 3;
        System.out.println("평균 : "+avg);

    }

    // 성적 배열을 매개변수로 전달 받아 합계를 계산해서 리턴하는 함수 (재사용 목적)
    public int add(int[] scores) {
        // 성적 합계
        int sum = 0;
        for (int i=0; i<3; i++){
            sum += scores[i];
        }
        return sum;
    }

    // 2차원 배열 : 배열 속의 배열
    public void ArrayInArray(){
        // 자바에서 2차원 배열 정의 및 생성
        // 1) 2차원 배열 정의 및 생성
        // 2차원 배열 : 균형잡힌 배열
        int[][] matchScores = {{1,2,3},{11,12,13}};
        // 2) 2차원 배열 정의 및 생성
        // 행렬 : 2차원 배열
        // int[][] matchScores2 = new int[행개수][열개수];
        // for() { // 바깥쪽 중괄호 : 2개 , 1st [개수]
        //   for{}{ // 안쪽 중괄호 : 3개 , 2nd [개수]
        //   }
        // }
//        int[][] matchScores2 = new int[2][3];

        // 이중 for문을 작성해서 출력해보세요.
        // 1st 배열 {} : 배열함수.length
        // 2nd 배열 {{}} : 배열변수[1st 인덱스번호].length
        // ex) matchScores[0].length = 3
        //     matchScores[1].length = 3
        // 2차원 배열의 값 가져오기 : 배열변수[인덱스번호][인덱스번호]
        for(int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println("("+i+","+j+")"+" = "+matchScores[i][j]);

            }        }

//        1) 2차원 배열(참고) : 비대칭(균형 잡히지 않은) 배열
        int[][] englishScores = {{95, 96}, {78, 79, 80}};

        System.out.println("------------------- englishScores -------------------");

//        2차원 배열(비대칭) 출력하기
        for(int i=0; i<englishScores.length; i++) {
            for(int j=0; j<englishScores[i].length; j++) {
                System.out.println("(" + i + ", " + j + ") = " + englishScores[i][j]);
            }
        }

//        2) 2차원 배열(참고) : 비대칭(균형 잡히지 않은) 배열
        int[][] englishScores2 = new int[2][];

        englishScores2[0] = new int[]{1, 2};
        englishScores2[1] = new int[]{11, 12, 13};

        System.out.println("------------------- englishScores2 -------------------");

//        2차원 배열(비대칭) 출력하기
        for(int i=0; i<englishScores2.length; i++) {
            for(int j=0; j<englishScores2[i].length; j++) {
                System.out.println("(" + i + ", " + j + ") = " + englishScores2[i][j]);


            }
        }
    }
    // 데이터 복사 방법(참고) :
    //       1) 카피본 생성 복사 (깉은 복사, Deep Copy) : new 배열 생성, for문 실행 , .arraycopy()함수
    //       2) 방번호(주소값) 복사 (얇은 복사, Swallow Copy) : 배열변수2 = 배열변수1
    public void ArrayCopyByForExample() {
        
        // 1) 깊은 복사 : 복사본 생성해서 데이터 복사하기
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5]; // 값을 저장할 새로운 방을 만들기

        for(int i=0; i<oldIntArray.length; i++){
            //oldIntArray의 값을 newIntArray 배열에 복사하기
            newIntArray[i] = oldIntArray[i];
        }

        // 새로운 배열 출력하기
        for(int i=0; i<newIntArray.length; i++){
            System.out.println(newIntArray[i]);
        }

        // 2) 자바 함수 사용해서 깊은 복사하기
        String[] oldStrArray = {"java","python","c"};
        String[] newStrArray = new String[5]; // 값을 저장할 새로운 방을 만들기
        
        // 깊은 복사 함수 사용
        //.arraycopy(원본배열변슈, 원본의복사시작위치, 복사본배열변수, 복사본의 index값, 원본배열길이)
        System.arraycopy(oldStrArray,0, newStrArray, 0, oldStrArray.length);

        // 새로운 배열 출력하기
        for(int i=0; i<newStrArray.length; i++){
            System.out.println(newStrArray[i]);
        }

    }
    // 자바스크립트 : 개선된(향상된) for문
    // 자바 : 개선된(향상된) for문
    public void AdvancedForExample(){
        int[] scores = {95, 71, 72, 73, 88};

        // 점수 총합과 평균 구하기
        // 사용법 : for(자료형 변수명 : 배열변수명) {반복문}
        // 배열의 끝까지 순회해서 끝에 다다르면 반복문이 종료 ( 증감식이 없음, 자동 증가)
        int sum = 0;
        for(int score : scores){
            sum = sum + score;
        }
        System.out.println("점수 총합 : " + sum);
        
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 : " + avg);
    }
}


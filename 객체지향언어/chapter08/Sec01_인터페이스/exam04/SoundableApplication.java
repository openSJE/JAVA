package chapter08.Sec01.exam04;

/**
 * packageName : chapter08.Sec01.exam04
 * fileName : SoundableApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class SoundableApplication {
    // 공유 함수
    static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat()); // "야옹"
        printSound(new Dog()); // "멍멍"
    }
}

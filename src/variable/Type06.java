package variable;

public class Type06 {
    public static void main(String[] args) {

//      문자열 연산 자동 타입 변환
//      "문자열(String)" + 숫자 → "문자열숫자"
//      숫자 + "문자열(String)" → "문자열숫자"
        System.out.println(3 + 7);      // 10
        System.out.println("3" + 7);    // String 타입의 "37"
        System.out.println(3 + "7");    // String 타입의 "37"

    }
}

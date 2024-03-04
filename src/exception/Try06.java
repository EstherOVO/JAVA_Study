package exception;

public class Try06 {
    public static void main(String[] args) {

//      NumberFormatException
        String str1 = "1000";
        String str2 = "1000개";

//      정상적으로 문자열 → 숫자 변경 가능한 경우
        int i1 = Integer.parseInt(str1);
//      문자열 → 숫자로 변경 불가능한 경우
        int i2 = Integer.parseInt(str2);

        System.out.println(i1 + i2);    // 예외 발생 가능 코드 : NumberFormatException
    }
}

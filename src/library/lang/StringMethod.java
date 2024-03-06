package library.lang;

public class StringMethod {
    public static void main(String[] args) {

//      문자열에서 자주 사용되는 메서드

//      1. length() : 문자열의 길이(문자 수)를 반환한다.
        int l1 = "".length();   // 0
        int l2 = "반갑습니다.".length(); // 6 → 특수문자나 기호도 글자로 포함한다.
        int l3 = "공백도 길이로 칠까요?".length();   // 12 → 공백도 글자로 포함된다.
        int l4 = "\n\t이스케이프 문자는?".length();  // 11 → 이스케이프 문자도 글자로 포함된다.

//      2. isEmpty() : 문자열의 길이가 0인지 여부를 확인해 준다.
        String em1 = "";
        String em2 = " ";
        String em3 = "\t\t\n";

        System.out.println("1번 문자열의 길이가 0인가요 : " + em1.isEmpty());   // true
        System.out.println("2번 문자열의 길이가 0인가요 : " + em2.isEmpty());   // false
        System.out.println("3번 문자열의 길이가 0인가요 : " + em3.isEmpty());   // false

//      3. isBlank() : 공백을 제외한 문자 길이가 0인지 여부를 확인해 준다.
        System.out.println("1번 공백을 제외하고 문자 길이가 0인가요 : " + em1.isBlank());   // true
        System.out.println("2번 공백을 제외하고 문자 길이가 0인가요 : " + em2.isBlank());   // true
        System.out.println("3번 공백을 제외하고 문자 길이가 0인가요 : " + em3.isBlank());   // true

//      4. trim() : 문자열 시작과 끝 좌우의 white space(요소 내부의 공백 문자) 제거 → 내부 공백은 제거되지 않는다.
        String str = "  \t입력된 정보   아하하  \n";
        System.out.println("기존 문자열 : " + str);
        System.out.println("trim 문자열 : " + str.trim());

//      기존 문자열을 변경하지 않고 새로운 문자열 객체를 생성하여 리턴한다.
        String trim = str.trim();
      }
}

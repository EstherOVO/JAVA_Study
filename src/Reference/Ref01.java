package Reference;

public class Ref01 {
        public static void main(String[] args) {    // 메소드 영역(Method Area) → 스택 영역

//      int는 기본 타입(꿀팁은 타입 첫 문자가 소문자면 기본 타입 / 대문자면 참조 타입)
        int int1 = 10;  // 변수 선언 및 초기화 → 스택 영역 : 10
        int int2 = 10;

//      문자열(String)은 참조 타입 : 힙 영역 0x100 → "홍길동" (여기에서 "홍길동"은 문자열 리터럴)
        String str1 = "홍길동";    // 변수 선언 및 초기화 → 스택 영역 : 0x100 (메모리 주소)
        String str2 = "홍길동";    // 변수 선언 및 초기화 → 문자열 리터럴을 참조 : 0x100

        if (int1 == int2) {
            System.out.println("int1과 int2는 값이 같다.");
        } else {
            System.out.println("int1과 int2는 값이 다르다.");
        }

        if (str1 == str2) {
            System.out.println("str1과 str2는 값이 같다.");
        } else {
            System.out.println("str1과 str2는 값이 다르다.");
        }

//      new 연산자 : 객체를 생성하는 연산자
//      힙 영역 : 0x200 → 홍길동 / 0x300 → 홍길동
        String str3 = new String("홍길동");    // 변수 선언 및 초기화 → 스택 영역 : 0x200 (메모리 주소)
        String str4 = new String("홍길동");    // 변수 선언 및 초기화 → 스택 영역 : 0x300 (메모리 주소)

//      ==, != 연산은 변수의 값이 같은지 아닌지를 비교
//      참조 타입의 경우 동일한 객체를 참조하는지 아닌지를 비교
        if (str3 == str4) {         // 0x200 == 0x300 → false
            System.out.println("str1과 str2는 값이 같다.");
        } else {
            System.out.println("str1과 str2는 값이 다르다.");
        }

//      문자열 비교할 때는 가능하면 equals method를 사용!
        if (str3.equals(str4)) {    // "홍길동" == "홍길동" → true
            System.out.println("str1과 str2는 문자열이 같다.");
        } else {
            System.out.println("str1과 str2는 문자열이 다르다.");
        }

    }
}

package Reference;

public class Ref03 {
    public static void main(String[] args) {

        Data data1 = new Data();    // 데이터 생성하여 참조값을 data1에 저장한다. data = 0x10
        data1.value1 = 15;
        Data data2 = data1; // 객체의 위치를 가리키는 참조값을 복사한다. data2 = 0x10

        int a = 10, b = 20;
        int sum = a + b;    // 기본 타입은 연산이 가능하다.

//      int dataSum = data1 + data2; 참조 타입은 기본적으로 연산이 불가능하다. (문자열의 연산(글자가 이어지는 것)은 제외)
        int dataSum = data1.value1 + data2.value2;  // 참조 타입의 기본 타입 필드에 접근하면 연산 가능하다.

//      String 문자열은 특별한 타입으로 문자열 연결 연산 가능하다.
//      예시 String a = "1" / String b = "2" → a + b → 출력 : 12
    }
}

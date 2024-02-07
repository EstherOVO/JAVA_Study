package Variable;

public class Type02 {
    public static void main(String[] args) {

//      Primitive Type(기본 타입) Of Java

//      논리값
        boolean bool = false;   // true or false ★★★
        char c = 'C';

//      정수
        byte b = 127;       // -128 ~ 127 (2^8_8bit 데이터 저장) = 1byte
        short s = 32767;    // -32768 ~ 32767 (2^16_16bit 데이터 저장) = 2byte
        int i = 214748647;  // -214748648 ~ 214748647 (2^32_32bit 데이터 저장) = 4byte ★★★
        long l = 9223372036854775807L;   // (2^64_64bit 데이터 저장) = 8byte ★★★

//      실수
        float f = 10.0f;    // 데이터 정밀도 7자리(소수점 7자리) (32bit = 4byte)
        double d = 10.0;    // 정밀도 15자리(소수점 15자리)     (64bit = 8byte) ★★★

/*
        리터럴(Literal) : "문자 그대로"의 의미로, 소스코드에서 개발자가 직접 적은 고정된 프로그래밍 값
        EX) 100, 10.0, 'A', "안녕하세요" → 이런 게 모두 리터럴(Literal)
 */

    }
}

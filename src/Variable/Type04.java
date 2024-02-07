package Variable;

public class Type04 {
    public static void main(String[] args) {

//      강제 타입 변환(Casting) : 큰 타입을 작은 타입으로 강제로 나눠서 저장

        int i = 10;
//      byte b = i;         // 큰 타입에서 작은 타입으로 변환 불가능
        byte b = (byte) i;  // 작은 타입으로 강제로 변환 → Casting 연산자 사용

        double d = 3.14;
        int i2 = (int) d;

        System.out.println("i2 = " + i2);
//      실수 타입이 정수 타입으로 Casting 될 때는 소수점 이하 부분은 버려진다.

    }
}

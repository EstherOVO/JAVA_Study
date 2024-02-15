package Method;

public class Method06 {
    public static void main(String[] args) {

//      자바에서 메소드는 변수의 값을 복사해서 대입한다.
//      메인 메소드의 number와 multiply2의 number는 다른 값이다. (변수 이름만 같은 거임)
//      다른 메소드에서 변경된 number의 값은 메인 메소드의 number에 영향을 주지 않는다.
        int number = 3;
        System.out.println("메소드 호출 전 : " + number);
        multiply2(number);  // 메인 메소드의 number를 복사한 값
        System.out.println("메소드 호출 후 : " + number);
    }

    public static void multiply2(int number) {
        System.out.println("메소드 호출 연산 실행 전 : " + number);
        number = number * 2;
        System.out.println("메소드 호출 연산 실행 후 : " + number);
    }
}

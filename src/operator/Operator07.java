package operator;

public class Operator07 {
    public static void main(String[] args) {

//      비교 연산자(comparison operator)
//      == 같다 equal to
//      !== 같지 않다 not equal to
//      > 크다 greater than
//      < 작다 less than
//      >= 크거나 같다 greater than equal to
//      <= 작거나 같다 less than equal to
//      비교 연산자의 결과는 참(true) 또는 거짓(false)으로 결과가 나온다.
//      boolean 타입의 결과를 갖는다.

        int a = 5;
        int b = 10;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        boolean result = a == b;
        System.out.println(result); // false

//      조건문과 함께 자주 사용된다.

    }
}

package Operator;

public class Operator09 {
    public static void main(String[] args) {

//      논리 연산자(logical operator)
//        boolean 타입인 true와 false를 비교하는 데에 사용한다.
/*
        && (And, 그리고) : 두 피연산자가 모두 true면 true, 하나라도 false면 false
        || (Or, 또는) : 두 피연산자 중 하나만 true여도 true, 둘 다 false면 false
        !  (Not, 부정) : true면 false, false면 true
*/

        System.out.println("AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("부정 연산");
        System.out.println(!true);
        System.out.println(!false);

        int x = 15;
//      x는 10보다 크고 20보다 작다.
        boolean result = (x > 10 && x < 20);
        System.out.println("비교 : " + result);

    }
}

package Operator;

public class Operator05 {
    public static void main(String[] args) {

        int x = 1;
        int y = 0;

//      전위표기법(Prefix) : "x의 값을 먼저 증가시키고, 그 결과를 y에 대입하라."는 의미
        y = ++x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("=========");

//      후위표기법(Postfix) : "x에 현재 값을 y에 먼저 대입하고, 그다음에 x에 값을 증가시켜라."는 의미
        x = 1;
        y = 0;

        y = x++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

//      증감 연산자를 단독으로 사용할 때는 본인의 값만 증가하기 때문에 전위 후위 모두 결과가 같다.

    }
}

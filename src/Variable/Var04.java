package Variable;

public class Var04 {
    public static void main(String[] args) {

//      두 변수의 값을 교환하기
/*
        A Container : 물 10ml
        B Container : 주스 20ml
        어떻게 하면 내용물을 바꿀 수 있을까?

        나의 답변 : 제3의 C Container를 등장시켜 교환한다.
        1) A > C
        2) B > A
        3) C > B
*/

//      선생님 답변 :
        int a = 10; // A Container
        int b = 20; // B Container
        int temp;   // temp Container

        temp = a;   // temp Container에 A Container의 내용물(물 10ml)을 넣는다.
        a = b;      // A Container에 B Container의 내용물(주스 20ml)을 넣는다.
        b = temp;   // B Container에 temp Container의 내용물(물 10ml)을 옮긴다.

        System.out.println("A Container = " + a);
        System.out.println("B Container = " + b);

    }
}

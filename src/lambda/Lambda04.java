package lambda;

public class Lambda04 {
    public static void main(String[] args) {

//      반환 값이 있을 경우, 중괄호와 리턴 생략
//      Param multiply = x -> { return x * x; };

//      매개변수가 하나만 있을 때는 ( ) 생략이 가능
        Param multiply2 = (x) -> x * x;
        Param multiply3 = x -> x * x;

        System.out.println("4 * 4 = " + multiply2.func(4));
        System.out.println("4 * 4 = " + multiply3.func(4));
    }
}

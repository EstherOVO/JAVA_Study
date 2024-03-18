package lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
//  메서드 참조
//  이미 선언된 메서드 또는 생성자의 이름을 참조하여 람다식의 축약형으로 사용할 수 있게함
    public static void main(String[] args) {

//      최대값을 구하는 람다식
        BinaryOperator<Integer> returnMax // (left, right) -> Math.max(left, right);
                = Math::max;    // (전달 역할만 하는) 불필요한 매개변수를 지우고 축약형으로 나타낸다.
        Integer max = returnMax.apply(50, 70);
        System.out.println("max = " + max);

//      정적 메서드를 참조할 경우
//      클래스 이름 뒤어 :: 기호를 붙이고 정적 메서드 이름
//      클래스 이름::메서드 이름

//      인스턴스 메서드를 참조할 경우
//      참조변수 이름::메서드 이름

        Consumer<String> printer1 = ((string) -> System.out.println(string));
        Consumer<String> printer2 = System.out::println;     // 메서드의 참조값 주소
        printer1.accept("출력해 주는 함수예요~");
        printer2.accept("출력해 주는 함수예요.");

//      메서드 참조를 사용한 경우
        Function<String, Integer> stringToIntegerFunction1 = ((integer) -> Integer.parseInt(integer));
        Function<String, Integer> stringToIntegerFunction2 = Integer::parseInt;
        System.out.println(stringToIntegerFunction1.apply("123"));
        System.out.println(stringToIntegerFunction2.apply("123"));
    }
}

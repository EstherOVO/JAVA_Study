package lambda.function01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Function03 {
    public static void main(String[] args) {

//      매개변수가 1개 <T>가 있고, 리턴 값이 없음
        Consumer<Integer> oddEven = number -> {
            if (number % 2 == 0) {
                System.out.println(number + "은(는) 짝수입니다.");
            } else {
                System.out.println(number + "은(는) 홀수입니다.");
            }
        };

//      변수에 저장된 함수를 실행
        oddEven.accept(3);
        oddEven.accept(4);

//      버튼 객체 생성
        Button dogButton = new Button("강아지");
        dogButton.setOnClickListener(() -> System.out.println("멍멍"));

//      버튼을 클릭하는 함수(람다식)를 함수형 인터페이스에 저장
        Consumer<Button> clickButton = button -> button.onClick();

//      변수에 저장된 함수(객체를 실행하는 람다식)를 실행
        clickButton.accept(dogButton);

//      Supplier : 매개 변수는 없고, 리턴 값이 있음
        Supplier randomSupplier = () ->(int) (Math.random() * 10) + 1;
        System.out.println("랜덤 값 : " + randomSupplier.get());

//      Function : 매개변수 <T>가 있고, 리턴 값<R>도 있음
        Function<String, Integer> stringLengthFunction = string -> string.length();
        Integer length1 = stringLengthFunction.apply("이 문자열의 길이를 반환");
        System.out.println("문자열의 길이 : " + length1);

//      BiFunction : 매개변수 2개 <T, U>가 있고, 리턴 <R> 값도 있음
        BiFunction<String, String, Integer> concatLength = (s1, s2) -> (s1 + s2).length();
        Integer length2 = concatLength.apply("문자열 합쳤을 때", "길이를 정수로 반환");
        System.out.println("문자열의 길이 : " + length2);

//      Predicate : 매개변수가 1개 <T>가 있고, 리턴 값이 Boolean → 입력에 대해 참, 거짓 여부 평가
        Predicate<String> isTenUpper = string -> string.length() > 10;
        System.out.println(isTenUpper.test("이 글자의 길이는 10자가 넘나요?") ? "10자가 넘습니다." : "10자 미만입니다.");

//      BiPredicate : 매개변수가 2개<T, U> 있고, 리턴 값이 Boolean
        BiPredicate<Character, Integer> isSameNumber = (((character, integer) -> (int) character == integer));
        boolean b1 = isSameNumber.test('A', 64);
        boolean b2 = isSameNumber.test('A', 65);

        System.out.println("'A'는 아스키코드 64인가? " + b1);
        System.out.println("'A'는 아스키코드 65인가? " + b2);

//      UnaryOperator : 매개변수의 타입과 리턴 타입이 독같은 형태의 Function Operator(단항 연산자)
        UnaryOperator<Integer> powerOperator = x -> x * x;
        System.out.println("5 * 5 = " + powerOperator.apply(5));

//      BinaryOperator : 매개변수의 타입과 리턴 타입이 독같은 형태의 Function Operator(이항 연산자)
        BinaryOperator<Integer> sumOperator = (x, y) -> x + y;
        System.out.println("20 + 30 = " + sumOperator.apply(20, 30));

//      컬렉션 프레임워크와 함께 사용
        List<String> nameString = new ArrayList<>();
        nameString.addAll(List.of("홍길동", "임꺽정", "전우치"));

//      Consumer 타입(함수형 인터페이스 = 함수)을 매개변수로 받음
        Consumer<String> printConsumer = string1 -> System.out.println(string1);
        nameString.forEach(printConsumer);

        nameString.forEach((string2) -> System.out.println("이름 : " + string2));
    }
}

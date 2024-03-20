package stream;

import java.util.stream.IntStream;

public class Stream07 {
//    스트림 요소 반복 looping
//    스트림 요소에 대해 지정한 작업을 반복해서 수행
//    매개변수로 Consumer : 리턴 값이 없고, 매개변수는 있다.
//    중간 연산 : peek
//    최종 연산 : forEach

    public static void main(String[] args) {
//      peek : 중간 연산으로, 스트림 처리 과정에 영향을 주지 않고
//      각 요소의 중간 결과들을 확인하는 디버깅 용도로 주로 사용한다.

        IntStream.rangeClosed(1, 10)
                .peek(n -> System.out.println("초기값 : " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("필터값 : " + n))
                .map(n -> n * 10)
                .peek(n -> System.out.println("변환값 : " + n))
                .forEach(System.out::println);
    }
}

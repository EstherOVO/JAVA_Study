package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream10 {
//  reduce : 다양한 Reduction을 커스터마이징할 수 있는 메서드

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(new Student("홍길동", 92),
                        new Student("임꺽정", 88),
                        new Student("이몽룡", 95)));

        int sum1 = studentList.stream()      // 학생 객체 스트림
                .mapToInt(Student::score)    // 점수 정수 스트림 반환
                .sum();                      // 최종 연산 합계
        System.out.println("sum1 = " + sum1);

//      reduce의 매개변수 BinaryOperator
//      identity : 디폴트 값으로 설정
//      누산기(accumulator) BinaryOperator : 두 개의 값을 받아 하나를 리턴(모든 타입 동일)
        Integer sum2 = studentList.stream()
                .map(Student::score)
                .reduce(0, (a, b) -> a + b);
//                      arg1 : 출력 값이 다음 스트림의 입력 값으로 대입 → 누적된 결과
//                      arg2 : 데이터의 흐름(스트림)의 입력 값 → 현재 요소

        System.out.println("============");
        OptionalInt reduce = IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 1)
                .reduce((previous, current) -> {
                    System.out.printf("%d * %d = %d\n", previous, current, previous * current);
                    return previous * current;
                });
        System.out.println("1부터 10까지 홀수만 곱한 값 : " + reduce.orElse(1));

//      초기 값이 주어지는 경우 첫 번째 값을 초기 값으로 설정한다.
//      곱셈 연산 시 0이 주어지지 않도록 주의
//      (기본) 곱셈 연산 초기 값 : 1 / 덧셈 연산 시 초기 값 : 0
        int reduceResultWithIdentity = IntStream.rangeClosed(1, 10)
                .reduce(2, (previous, current) -> previous * current);
        System.out.println("reduceResultWithIdentity = " + reduceResultWithIdentity);

        List<String> words = Arrays.asList("가나", "다라마", "아자차카");

        Integer lengthTotal = words.stream()
                .map(String::length)    // 문자열 길이 정수로 매핑
                .reduce(0, Integer::sum);   // 각각 더해주는 Reduction 연산
        System.out.println("모든 문자열의 길이 = " + lengthTotal);
    }

    record Student(String name, int score) {}
}

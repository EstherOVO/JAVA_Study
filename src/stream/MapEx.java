package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("홍길동", 80));
        studentsList.add(new Student("홍길동", 95));
        studentsList.add(new Student("홍길동", 92));

//      학생 객체 스트림에서 score만 사용하는 정수 스트림으로 변환
        studentsList.stream()
                .mapToInt(student -> student.getScore())
                .forEach(System.out::println);

        double average = studentsList.stream()  // 학생 객체 스트림 생성
                .mapToInt(Student::getScore)    // 중간 연산 : 점수 정수 스트림 변환
                .average()                      // 최종 연산 : 점수의 평균 → Optional
                .getAsDouble();                 // Optional 타입에서 값 꺼내기

        System.out.println("평균 : " + average);

//      기본 타입 간의 변환 메서드
//      asLongStream(), asDoubleStream()
        int[] array = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(array);

        intStream
                .asDoubleStream()   // 중간 연산 : 실수 스트림 변환
                .forEach(System.out::println);  // 최종 연산 : 요소 출력

//      flatMap() : 하나의 요소를 여러 개의 요소로 변환한 스트림을 반환
        List<String> stringList = new ArrayList<>(List.of("Hello, Java and Stream", "I am a Developer"));

//      문장 스트림을 단어 스트림으로 변환하여 출력
        stringList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println);
    }
}

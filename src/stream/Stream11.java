package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream11 {
//  스트림 요소 수집하기 collect()
//  유연한 *최종 연산*
//  Collector 인터페이스 구현을 매개변수로 받아 작업
//  Collector<T, A, R> collector
//  T는 스트림의 요소
//  A는 accumulator 누산기 (T 타입의 요소를 A 누산기가 누적해서 R타입에 저장한다.)
//  R은 반환될 컬렉션

    public static void main(String[] args) {

        record Student(String name, String gender, int age) {}

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("홍길동", "남", 30),
                new Student("김영희", "여", 25),
                new Student("이철수", "남", 20),
                new Student("오해영", "여", 28)));

//      toList() : 리스트로 수집
        List<Student> maleList = studentList.stream()
                .filter(student -> student.gender.equals("남"))
//              .collect(Collectors.toList())
                .toList();

//      toSet() :
        Set<Student> maleSet = studentList.stream()
                .filter(student -> student.gender.equals("남"))
                .collect(Collectors.toSet());

//      toMap() : 키, 값 쌍으로 함수를 통해 각 요소에서 추출
        Map<String, Integer> maleMap = studentList.stream()
                .filter(student -> student.gender.equals("남"))
                .collect(Collectors.toMap(
                        Student::name,  // Student 객체에서 Key가 될 부분
                        Student::age)); // Student 객체에서 Value가 될 부분

//      joining : 스트림의 문자열 요소를 하나의 문자열로 만든다.
//      구분된 문자열을 단일 문자열 연결로 만들 때 유용
//      JSON, HTML 문자열로 만들 때 사용
        Stream<String> stringStream = Stream.of("자바", "스트림", "람다식");
        String join1 = stringStream.collect(Collectors.joining());
        System.out.println("매개변수 없이 조인한 문자열 = " + join1);

        String join2 = Stream.of("자바", "스트림", "람다식").collect(Collectors.joining(", "));
        System.out.println("구분자를 첫 번째 인자로 조인한 문자열 = " + join2);

        String join3 = Stream.of("자바", "스트림", "람다식").collect(Collectors.joining(" // ", "[", "]"));
        System.out.println("접두사와 접미사를 사용해서 조인한 문자열 = " + join3);

//      요소 그루핑
        Map<String, List<Student>> genderMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::gender));

        System.out.println("genderMap = " + genderMap);
    }
}

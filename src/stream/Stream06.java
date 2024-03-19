package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream06 {
//  요소 정렬

    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("아자차", 80));
        studentsList.add(new Student("가나다", 95));
        studentsList.add(new Student("마바사", 92));

        studentsList.stream()
//              Comparator 매개 변수로 하는 방법 혹은 Comparable 인터페이스
                .sorted()   // 중간 연산 : 정렬(Comparable)
                .map(Student::getName)  // 중간 연산 : 이름 필드 스트림으로 변환
                .forEach(System.out::println);  // 최종 연산 : 요소 출력

        studentsList.stream()
                .sorted(Comparator.reverseOrder())
                .map(Student::getName)
                .forEach(System.out::println);

//      최종 연산 : collect()
//      스트림 요소를 수집해서 컬렉션으로 변환
        List<String> nameList = studentsList.stream()
                .sorted()
                .map(Student::getName)
                .toList();
//              .collect(Collectors.toList());

        Set<Integer> scoreSet = studentsList.stream()
                .sorted()
                .map(Student::getScore)
                .collect(Collectors.toSet());
    }
}

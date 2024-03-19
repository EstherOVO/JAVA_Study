package stream;

import java.util.ArrayList;
import java.util.List;

public class Stream03 {
    public static void main(String[] args) {

//      스트림은 하나 이상 연결되어서 중간 과정들이 계속 연결될 수 있음
//      스트림 파이프라인 pipeline
//      메서드 체이닝 : Stream → Stream → Stream → <Return>
//      연결된 파이프라인에서 최종 연산(집계)이 되어 값으로 변환된다.

//      데이터 필터링
        List<String> list = new ArrayList<>();
        list.addAll(List.of("홍길동", "홍두깨", "임꺽정", "홍반장", "김철수", "홍길동"));

//      distinct() : 중복요소 제거
        list.stream()
                .distinct() // 중간 연산 : 중복 요소 제거
                .forEach(System.out::println);  // 최종 연산

        System.out.println("======================");

//      filter() : 매개변수로 Predicate을 받아 조건을 만족하는 데이터만 필터링
        list.stream()
                .filter(name -> name.startsWith("홍"))   // 중간 연산
                .forEach(System.out::println);  // 최종 연산

        System.out.println("======================");

//      파이프라인 연결하기 : 중복 요소가 제거되며, "홍"씨 성을 가진 사람 필터링
        list.stream()
                .distinct()
                .filter(name -> name.startsWith("홍"))
                .forEach(System.out::println);
    }
}

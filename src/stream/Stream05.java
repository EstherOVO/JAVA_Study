package stream;

import java.util.stream.IntStream;

public class Stream05 {
    public static void main(String[] args) {

//      filter() : 데이터를 걸러냄
        IntStream.range(1, 100) // 스트림 생성
                .filter(i -> i % 2 == 0)    // 중간 연산 : 짝수만 걸러내기
                .skip(10)                // 중간 연산 : 10개 뛰어넘기(앞에서부터 10개를 스킵한다.)
                .limit(10)          // 중간 연산 : 10개까지 끊기(스킵 이후 10개의 요소를 출력하도록 제한한다.)
                .forEach(System.out::println);  // 최종 연산 : 요소 출력

        System.out.println("===============");

//      map() : 요소를 변환 Function (매개변수 -> 리턴값)
        IntStream.rangeClosed(1, 10)  // 스트림 생성 : 1 ~ 10
                .map(i -> i * 10)               // 중간 연산 : 모두 10배씩
                .forEach(System.out::println);  // 최종 연산 : 요소 출력

    }
}

package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>(List.of(7, 2, 5, 3, 4, 6, 0, 9, 1));

//      데이터에서 홀수만 골라내서 1, 3, 5, 7, 9와 같은 문자열로 변경하라

//      1. 반복문을 사용하는 반식
//      1) 홀수 골라내기
        List<Integer> oddList = new ArrayList<>();
        for (Integer n : numberList) {
            if (n % 2 == 1) {
                oddList.add(n);
            }
        }
        System.out.println("oddList = " + oddList);

//      2) 정렬하기
        oddList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println("oddList = " + oddList);

//      3) 문자열로 연결하기
        List<String> oddStringList = new ArrayList<>();

        for (Integer integer : oddList) {
            oddStringList.add(String.valueOf(integer));
        }
        System.out.println("oddStringList = " + oddStringList);

//      4) String 정적 메서드 조인(구분자, 반복 가능 데이터) → 구분자로 문자열 연결
        String joinString = String.join(" // ", oddStringList);
        System.out.println("joinString = " + joinString);

//      스트림 API를 사용한 방식
        String finalString = numberList.stream() // 데이터의 스트림화
                .filter((number) -> number % 2 == 1)    // 중간 연산 : 홀수만 찾기
//              .sorted((number1, number2) -> Integer.compare(number1, number2))
                .sorted(Integer::compareTo) // 중간 연산 : 오름차순 정렬
                .map(String::valueOf)   // 중간 연산 : 문자열로 바꾸기
                .collect(Collectors.joining(" / "));// 최종 연산 : 구분자로 연결해서 반환

        System.out.println("finalString = " + finalString);
    }
}

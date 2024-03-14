package collection.map.ex01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {

/*
        연습문제 1. 학생 점수 관리

        문제 설명 :
        학생들의 이름과 그에 해당하는 점수를 HashMap을 사용하여 관리하는 프로그램을 작성하세요.
        프로그램은 다음 기능을 수행해야 합니다:

        학생의 이름과 점수를 추가합니다.
        특정 학생의 점수를 조회합니다.
        모든 학생의 이름과 점수를 출력합니다.

        예시 데이터 :
        학생 "Alice"의 점수는 85점입니다.
        학생 "Bob"의 점수는 92점입니다.
        학생 "Charlie"의 점수는 88점입니다.
*/

        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 85);
        map.put("Bob", 92);
        map.put("Charlie", 88);

        System.out.println("= 특정 학생의 점수 조회 =");
        System.out.println("학생 \"Alice\"의 점수는 " + map.get("Alice") + "점입니다.\n");

        System.out.println("= 전체 학생의 점수 조회 =");
        map.forEach((key, value) -> System.out.println("학생 " + key + "의 점수는 " + value + "점입니다."));
    }
}

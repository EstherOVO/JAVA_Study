package lambda.ex;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Ex01 {
    public static void main(String[] args) {

/*
        문제 1. 사용자 입력 처리하기

        요구사항 : 사용자의 이름과 점수를 입력받아 합격 여부를 결정합니다.
        점수가 50점 이상이면 "합격", 그렇지 않으면 "불합격"입니다.
        사용자의 이름과 점수는 Map<String, Integer>로 관리되며,
        BiFunction을 사용하여 각 사용자의 이름과 합격 여부를 출력하세요.

        입력 데이터
        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        출력예시
        ===
        Alice : 합격
        Bob : 불합격
        Charlie : 합격
*/

        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        BiFunction<String, Integer, Boolean> isPassed = (name, score) -> score > 80;

        for (String string : userScores.keySet()) {
            System.out.println(string + " : " + (isPassed.apply(string, userScores.get(string)) ? "합격" : "불합격"));
        }
    }
}

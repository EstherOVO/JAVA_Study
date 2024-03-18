package lambda.ex;

import java.util.function.Function;

public class Ex02 {
    public static void main(String[] args) {

/*
        문제 2. 날짜 변환기

        요구사항 : 주어진 날짜 문자열(예 : "20240320")을 "2024-03-20" 형태로 변환합니다.
        Function<String, String>을 사용하여 구현하세요.

        출력예시
        ===
        2024-03-20

        힌트 : 문자열 메서드(substring) 사용
*/

        Function<String, String> date = (string) -> {
            String year = string.substring(0, 4);
            String month = string.substring(4, 6);
            String day = string.substring(6, 8);
            return year + "-" + month + "-" + day;
        };

        System.out.println(date.apply("20240320"));
    }
}

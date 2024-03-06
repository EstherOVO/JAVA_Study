package library.lang;

import java.util.Arrays;

public class StringMethod06 {
    public static void main(String[] args) {

//      16. repeat(int) : 문자열을 반복해 준다.
        String bell = "딸랑";

        System.out.println(bell.repeat(2));
        System.out.println(bell.repeat(4));
        System.out.println(bell.concat(" ").repeat(3).trim());

//      17. substring(int, int) : 문자열 지정된 부분 문자열 반환한다.
//      시작 인덱스는 포함하고, 끝 인덱스는 포함하지 않는다.
        System.out.println("안녕하세요".substring(2));   // 하세요
        System.out.println("안녕하세요".substring(0, 2));    // 안녕 substring(0, 1) 아님!

        String findText = "꽃이";
        String sentence = "무궁화 꽃이 피었습니다.";
        String substring = sentence.substring(
                sentence.indexOf(findText), // 시작 인덱스
                sentence.indexOf(findText) + findText.length());    // 끝 인덱스(시작 인덱스 + 길이)
        System.out.println(substring);

//      18. replace() : 치환한다. 지정된 문자열에서 다른 문자를 교체한 새 문자열로 반환한다.
        System.out.println("안녕하세요"
                .replace("안녕", "평안"));

        String hello = "안녕하세요, 저는 안녕합니다.";
        String replaced = hello.replace("안녕", "평안");
        System.out.println(hello);      // 원본은 변경되지 않음
        System.out.println(replaced);   // 모든 교체 문자열을 교체

//      19. split() : 지정된 구분자로 배열을 반환
        String memo = "사과,체리,바나나,딸기,복숭아";
        String[] fruits = memo.split(",");
        System.out.println(Arrays.toString(fruits));

        String todo = "청소하기 빨래하기 출근하기 잠자기";
        String[] todos = todo.split(" ");
        for (String s : todos) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(todos));
    }
}

package library.lang.ex;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09 {
    public static void main(String[] args) {

/*
        실습 문제 : 문자열 정보 처리 및 분석

        요구사항 :
        당신은 텍스트 기반 데이터를 처리하는 소프트웨어를 개발하고 있습니다.
        사용자로부터 한 줄의 문자열을 입력받아,
        다음과 같은 정보를 출력하는 프로그램을 작성하세요.

        - 입력받은 문자열의 길이
        - 문자열에서 공백의 수
        - 문자열을 쉼표(,)로 분리한 후, 각 부분 문자열의 길이를 출력
        - 문자열이 "Java"를 포함하는지 여부
        - 문자열이 "프로그래밍"으로 끝나는지 여부
        - 문자열 중 "a" 문자가 몇 번 나타나는지 카운트(대소문자 구분 없음)
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력해 주세요 : ");
        String sentence = scanner.nextLine();

//      1.
        int sentenceLength = sentence.length();
        System.out.println("▣ 문자열의 길이 : " + sentenceLength);

//      2.
        int blankCount = sentenceLength - sentence.replace(" ", "").length();
        System.out.println("▣ 공백의 수 : " + blankCount + "개");

//      3.
        System.out.print("▣ 쉼표를 기준으로 나눈 각 문자열의 길이 : " );
        String[] splitComma = sentence.split(",");
        if (sentence.contains(",")) {
            for (int i = 0; i < splitComma.length; i++) {
                int splitCommaLength = splitComma[i].length();
                if (i == splitComma.length - 1) {
                    System.out.print(splitCommaLength + "개");
                } else {
                    System.out.print(splitCommaLength + "개, ");
                }
            }
        } else {
            System.out.println("문자열에 쉼표가 없습니다.");
        }
        System.out.println();

//      4.
        System.out.print("▣ 문자열이 \"자바(Java)\"를 포함하는가(한글 및 영어 대소문자 구분 없음) : ");
        boolean containsJavaEng = sentence.toLowerCase().contains("JAVA".toLowerCase());
        boolean containsJavaKor = sentence.contains("자바");
        if (containsJavaEng || containsJavaKor) {
            System.out.println("단어를 포함하고 있습니다.");
        } else {
            System.out.println("문자열에 해당 단어가 없습니다.");
        }

//      5.
        System.out.print("▣ 문자열이 \"프로그래밍\"으로 끝나는가 : ");
        if (sentence.endsWith("프로그래밍")) {
            System.out.println("해당 단어로 문자열이 끝납니다.");
        } else {
            System.out.println("문자열에 해당 단어가 없습니다.");
        }

//      6.
        System.out.print("▣ 문자열 중 \"a\"(혹은 \"A\")가 몇 번 등장하는가 : ");
        int lowerACount = sentenceLength - sentence.replace("a", "").length();
        int upperACount = sentenceLength - sentence.replace("A", "").length();
        if (sentence.contains("a") || sentence.contains("A")) {
            System.out.println(lowerACount + upperACount + "번");
        } else {
            System.out.println("문자열에 해당 단어가 없습니다.");
        }
    }
}
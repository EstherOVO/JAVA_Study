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

        System.out.print("문자를 입력해 주세요 : ");
        String str = scanner.nextLine();

//      1.
        System.out.println("1. 입력받은 문자열의 길이 : " + str.length());

//      2.
        StringTokenizer str2 = new StringTokenizer(str," ");
        System.out.println("2. 문자열에서 공백의 수 : " + (str2.countTokens() - 1));

//      3.
        System.out.print("3. 쉼표를 제외한 각 부분 문자열의 길이 : ");
        if (str.contains(",")) {
            String[] split = str.split(",");
            for (String s : split) {
                System.out.print(s.length() + " ");
            }
        } else {
            System.out.print("문자열 내에 쉼표가 없습니다.");
        }

//      4.
        System.out.print("\n4. \"자바(Java)\"가 포함 되는지 여부(대소문자 상관없이 입력 가능합니다.) : ");
        boolean contains = str.toLowerCase().contains("JAVA".toLowerCase());
        boolean contains1 = str.contains("자바");
        if (contains || contains1) {
            System.out.println("포함됩니다.");
        } else {
            System.out.println("포함되지 않습니다.");
        }

//      5.
        System.out.print("5. \"프로그래밍\"이라는 단어로 끝나는지 여부 : ");
        boolean b = str.endsWith("프로그래밍");
        if (b) {
            System.out.println("끝납니다.");
        } else {
            System.out.println("끝나지 않습니다.");
        }

//      6.
        System.out.print("6. 문자열 중 \"a\" 문자가 몇 번 나타나는지(대소문자 상관없이 입력 가능합니다.) : ");
        int aCount = str.length() - str.replace("a", "").length();
        int aCount2 = str.length() - str.replace("A", "").length();
        System.out.println(aCount + aCount2 + "번");
    }
}

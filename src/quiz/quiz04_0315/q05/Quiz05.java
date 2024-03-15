package quiz.quiz04_0315.q05;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("문장 내 가장 긴 길이의 단어 찾기!");
        System.out.print("◈ 입력 문장 : ");
        String sentence = scanner.nextLine();

        String[] split = sentence.split(" ");

        String theLongestWord = "";

        for (String string : split) {
            if (theLongestWord.length() < string.length()) {
                theLongestWord = string;
            }
        }

        System.out.println("◆ 가장 긴 길이를 가진 단어 : \"" + theLongestWord + "\"");
    }
}

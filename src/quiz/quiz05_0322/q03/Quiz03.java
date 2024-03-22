package quiz.quiz05_0322.q03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz03 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("& 문장을 입력해 주세요 : ");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], 0);
        }

        for (int i = 0; i < words.length; i++) {
            if (!Pattern.matches("[^가-힣]", words[i])) {
                map.replace(words[i], map.get(words[i]) + 1);
            }
        }

        System.out.println("& 문장 내 단어 빈도 계산하기! &");
        map.forEach((key, value) -> System.out.println(String.format("\"%s\" : %d번", key, value)));
    }
}

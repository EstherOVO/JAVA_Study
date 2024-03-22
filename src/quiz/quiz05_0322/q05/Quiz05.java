package quiz.quiz05_0322.q05;

import java.util.function.Function;

public class Quiz05 {
    public static void main(String[] args) {

        Function<String, String> date = string ->
                string.substring(0, 4) + "-"
                        + string.substring(4, 6) + "-"
                        + string.substring(6, 8);

        String result = date.apply("20240320");
        System.out.println(result);
    }
}

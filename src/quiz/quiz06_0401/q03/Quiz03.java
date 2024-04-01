package quiz.quiz06_0401.q03;

import java.util.Arrays;
import java.util.List;

public class Quiz03 {
    public static void main(String[] args) {

        List<Integer> scores = Arrays.asList(16, -9, 4, 1, -16, 9, 25);

        scores.stream()
                .filter(score -> score > 0)
                .sorted()
                .peek(score -> System.out.print(score + " : "))
                .map(Math::sqrt)
                .forEach(System.out::println);
    }
}

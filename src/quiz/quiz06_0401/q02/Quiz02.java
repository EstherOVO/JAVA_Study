package quiz.quiz06_0401.q02;

import java.util.Comparator;
import java.util.Map;
import java.util.function.BiFunction;

public class Quiz02 {
    public static void main(String[] args) {

        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        BiFunction<String, Integer, String> function = (name, score) -> score >= 50 ? name + " : 합격" : name + " : 불합격";

        userScores.forEach((name, score) -> System.out.println(function.apply(name, score)));

        System.out.println("==========");

        userScores.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach((entry) -> System.out.println(entry.getValue() >= 50 ? entry.getKey() + " : 합격" : entry.getKey() + " : 불합격"));
    }
}

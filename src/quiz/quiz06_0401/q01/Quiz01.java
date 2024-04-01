package quiz.quiz06_0401.q01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz01 {
    public static void main(String[] args) {

        List<String> languages = Arrays.asList("java", "python", "swift", "cpp","ai");

        languages.sort(Comparator.naturalOrder());

        languages.forEach(System.out::println);
    }
}

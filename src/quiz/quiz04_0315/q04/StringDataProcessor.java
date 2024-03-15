package quiz.quiz04_0315.q04;

public class StringDataProcessor implements DataProcessor<String> {
    @Override
    public String processData(String string) {
        return string.toUpperCase();
    }
}

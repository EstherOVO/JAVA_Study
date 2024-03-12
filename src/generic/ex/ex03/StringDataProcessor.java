package generic.ex.ex03;

public class StringDataProcessor implements DataProcessor<String> {

    @Override
    public String processData(String string) {
        return string.toUpperCase();
    }
}

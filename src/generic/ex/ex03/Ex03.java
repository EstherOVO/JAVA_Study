package generic.ex.ex03;

public class Ex03 {
    public static void main(String[] args) {

        DataProcessor<String> stringProcessor = new StringDataProcessor();
        DataProcessor<Integer> intDataProcessor = new NumberDataProcessor();

        System.out.println(stringProcessor.processData("Hello, Generics"));
        System.out.println(intDataProcessor.processData(100));
    }
}

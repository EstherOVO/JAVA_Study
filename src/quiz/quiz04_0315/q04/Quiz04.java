package quiz.quiz04_0315.q04;

public class Quiz04 {
    public static void main(String[] args) {

        DataProcessor<String> strDataProcessor = new StringDataProcessor();
        DataProcessor<Integer> intDataProcessor = new NumberDataProcessor();

        String string = strDataProcessor.processData("hello, generics");
        Integer integer = intDataProcessor.processData(100);

        System.out.println("string = " + string);
        System.out.println("integer = " + integer);
    }
}

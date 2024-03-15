package quiz.quiz04_0315.q04;

public class NumberDataProcessor implements DataProcessor<Integer> {
    @Override
    public Integer processData(Integer integer) {
        return integer * 2;
    }
}

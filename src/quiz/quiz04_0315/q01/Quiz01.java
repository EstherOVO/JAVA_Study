package quiz.quiz04_0315.q01;

public class Quiz01 {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int count = 0;
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }

        long endTime = System.nanoTime();

        System.out.println("반복문 실행 시간 : " + (endTime - startTime));
    }
}

package Array;

public class Ex01 {
    public static void main(String[] args) {

//      학생들 점수가 10, 20, 30, 40, 50점이다.
//      배열을 선언하고, 모든 학생의 합계 점수와 평균 점수를 구해보세요.

        double[] scores = new double[5];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;
        scores[3] = 40;
        scores[4] = 50;

        double sum = 0;
        for (int score = 0; score < scores.length; score++) {
            sum += scores[score];
        }
        System.out.println("학생들의 점수 합계 : " + (double) sum + "점");
        double avg = sum / scores.length;
        System.out.println("학생들의 점수 평균 : " + (double) avg + "점");

    }
}

package Quiz;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        /*
        배열 : 점수를 입력받을 학생 수를 입력받아 배열에 저장하고,
        입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해 주세요.
        예시)
        학생 수는 몇 명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력할 학생 수를 말씀해 주세요 : ");
        int studentNumber = scanner.nextInt();

        System.out.println("점수를 입력해 주세요.");
        int studentScore[] = new int[studentNumber];

        int sum = 0;
        for (int i = 0; i < studentScore.length; i++) {
            System.out.print("점수 : ");
            int scores = scanner.nextInt();
            sum += scores;
        }
        System.out.println("합계 : " + sum + "점");
        System.out.println("평균 : " + (double) sum / studentScore.length + "점");
    }
}

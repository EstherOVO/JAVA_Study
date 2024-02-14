package Array;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

/*
        점수를 입력받을 학생 수를 입력받고,
        입력받은 수만큼 학생들의 점수를 입력받은 후, 합계와 평균을 출력해 주세요.
        - 예시
        학생 수는 몇 명인가요? 3
        점수를 입력하세요
        10
        20
        30
        >> 합계 : 60, 평균 : 20.0
*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수는 몇 명인가요? ");
        int enteredSudentsNumber = scanner.nextInt();

        System.out.println("점수를 입력하세요 : ");
        int[] enteredScores = new int[enteredSudentsNumber];

//      배열 요소를 입력받기
        for (int i = 0; i < enteredScores.length; i++) {
            enteredScores[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int j = 0; j < enteredScores.length; j++) {
            sum += enteredScores[j];
        }

        System.out.println("합계 : " + (double) sum);
        System.out.println("평균 : " + (double) sum / enteredScores.length);

    }
}

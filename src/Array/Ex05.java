package Array;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

//      2차원 배열을 활용한 점수 계산 문제
//      3명의 학생과 과목은 국어, 영어, 수학이 있다.
//      각각의 점수를 입력받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 학생의 이름을 입력하세요 : ");
        String name1 = scanner.nextLine();
        System.out.print("두 번째 학생의 이름을 입력하세요 : ");
        String name2 = scanner.nextLine();
        System.out.print("두 번째 학생의 이름을 입력하세요 : ");
        String name3 = scanner.nextLine();

        int[][] number = new int[3][3];

        for (int i = 0; i < number.length; i++) {
            System.out.println("국어 - 영어 - 수학 순서대로 성적을 입력해 주세요.");
            for (int k = 0; k < number[i].length; k++) {
                System.out.print("점수 : ");
                number[i][k] = scanner.nextInt();
            }
        }

        for (int i = 0; i < number.length; i++) {
            int sum = 0;
            for (int j = 0; j < number[i].length; j++) {
                sum += number[i][j];
            }
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + sum / number[i].length);
        }

    }
}

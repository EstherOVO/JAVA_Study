package Array;

import java.util.Scanner;

public class Ex05_3 {
    public static void main(String[] args) {

//      2차원 배열을 활용한 점수 계산 문제
//      3명의 학생과 과목은 국어, 영어, 수학이 있다.
//      각각의 점수를 입력받아, 각 학생의 총점과 평균을 구하는 프로그램을 작성하세요.
//      +) 문자열 배열을 활용하여 해당 과목의 점수를 입력받기
//      +) 학생의 수를 입력받아서 n명만큼의 총점과 평균을 구하기

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력해 주세요 : ");
        int student = scanner.nextInt();

        String name = "이름 : ";
        for (int n = 0; n < name.length(); n++) {
            String userName = scanner.nextLine();
            if (n == student)
                break;
        }

        int[][] score = new int[student][3];
        String[] subject = {"국어 : ", "수학 : ", "영어 : "};

        for (int i = 0; i < score.length; i++) {
            System.out.println("이름 순서에 따라 점수를 입력해 주세요 : ");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subject[j]);
                score[i][j] = scanner.nextInt();
                }
            }

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }

            System.out.println(i + 1 + "번째 학생의 점수 합계 : " + sum);
            System.out.println(i + 1 + "번째 학생의 점수 평균 : " + (double) sum / score.length);
            }

        }
}

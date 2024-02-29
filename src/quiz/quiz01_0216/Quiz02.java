package quiz.quiz01_0216;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        /*
        반복문 : 짝수의 합 구하기
        사용자로부터 두 정수 start와 end를 입력받아,
        start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
        출력예시
        ======
        시작 정수: 4
        끝 정수: 15
        4 + 6 + 8 + 10 + 12 + 14 = 54
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 정수를 입력해 주세요 : ");
        int startNumber = scanner.nextInt();

        System.out.print("마지막 정수를 입력해 주세요 : ");
        int endNumber = scanner.nextInt();

        System.out.print(startNumber + " ~ " + endNumber + " 사이의 짝수 :");
        int sum = 0;
        for (int even = startNumber; even <= endNumber; even++) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
                sum += even;
            }
        }
        System.out.println("\n" + startNumber + " ~ " + endNumber + " 사이 짝수의 합 : " + sum);
    }
}

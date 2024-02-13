package Loop;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

/*
        짝수의 합 구하기
        사용자로부터 두 정수 start와 end를 입력받아,
        start와 end 사이의 모든 짝수의 합을 계산하는 프로그램을 작성하세요
 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 정수 : ");
        int startNumebr = scanner.nextInt();
        System.out.print("끝 정수 : ");
        int endNumber = scanner.nextInt();

        System.out.print(startNumebr + " ~ " + endNumber + " 사이의 짝수 :");
        int sum = 0;
        for (int result = startNumebr; result <= endNumber; result++) {
            if (result%2 != 0) {
                continue;
            }
            sum += result;
            System.out.print(" " + result);
        }

        System.out.println("\n총 합계 : " + sum);

    }
}

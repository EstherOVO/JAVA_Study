package Loop;

import java.util.Scanner;

public class Ex04_3 {
    public static void main(String[] args) {

/*
        다이아몬드 패턴 출력하기
        홀수 정수 n을 입력받아 n의 높이를 가지는 다이아몬드 패턴 출력 프로그램
        n = 5

           *
          ***
         *****
          ***
           *
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("다이아몬드 패턴 만들기\n원하시는 홀수를 입력하세요 : ");
        int enteredNumber = scanner.nextInt();

        for (int line1 = 1; line1 <= enteredNumber; line1 += 2) {
            for (int blank1 = enteredNumber; blank1 > line1; blank1 -= 2) {
                System.out.print(" ");
            }
            for (int numberOfStar1 = 0; numberOfStar1 < line1; numberOfStar1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int line2 = 1; line2 <= enteredNumber; line2 += 2) {
            for (int blank2 = 0; blank2 < line2; blank2 += 2) {
                System.out.print(" ");
            }
            for (int numberOfStar2 = enteredNumber - 1; numberOfStar2 > line2; numberOfStar2--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

package Loop;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

/*
        구구단 출력하기
        사용자로부터 정수 n을 입력받아,
        n단의 구구단을 출력하는 프로그램을 작성해 주세요.
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 단부터 몇 단까지 알고 싶으신가요? ");
        int enteredNumber = scanner.nextInt();

        for (int timesTable = 1; timesTable <= enteredNumber; timesTable++) {
            System.out.println(timesTable + "단 : ");
            for (int result = 1; result <= 9; result++) {
                System.out.println(timesTable + " x " + (int) result + " = " + (int) (timesTable * result));
            }
        }

    }
}

package Loop;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

/*
        팩토리얼 계산하기
        사용자로부터 정수 n을 입력받아,
        n! (팩토리얼)의 값을 계산하는 프로그램을 작성하세요.
        while 반복문을 사용하여 구현합니다.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int enteredNumber = scanner.nextInt();

        int factorial = 1;
        int startNumber = 1;
        while (startNumber <= enteredNumber) {
            factorial *= startNumber;
            startNumber++;
        }

        System.out.println(enteredNumber + "! = " + (int) factorial);

    }
}

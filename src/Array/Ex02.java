package Array;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

/*
        5개의 정수를 입력받아서, 배열에 저장하고, 입력 순서대로 출력해보세요.
        - 예시
        정수를 5개 입력하세요.
        1
        2
        3
        4
        5
        >> 1, 2, 3, 4, 5
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 5개를 입력하세요.");
        int enteredNumber1 = scanner.nextInt();
        int enteredNumber2 = scanner.nextInt();
        int enteredNumber3 = scanner.nextInt();
        int enteredNumber4 = scanner.nextInt();
        int enteredNumber5 = scanner.nextInt();

        int[] enteredNumbers = new int[5];
        enteredNumbers[0] = enteredNumber1;
        enteredNumbers[1] = enteredNumber2;
        enteredNumbers[2] = enteredNumber3;
        enteredNumbers[3] = enteredNumber4;
        enteredNumbers[4] = enteredNumber5;


        System.out.print("입력한 정수 :");
        for (int result = 0; result < enteredNumbers.length; result++) {
            System.out.print(" " + enteredNumbers[result]);
            if (result < enteredNumbers.length - 1) {
                System.out.print(",");
            }
        }

    }
}

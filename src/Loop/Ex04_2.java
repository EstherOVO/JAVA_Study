package Loop;

import java.util.Scanner;

public class Ex04_2 {
    public static void main(String[] args) {

/*
           별의 패턴을 반대로 출력하기
           ****
           ***
           **
           *
*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("별을 몇 줄까지 출력할까요? ");
        int enteredNumber = scanner.nextInt();

        for (int line = 0; line <= enteredNumber; line++) {
            for (int numeberOfStar = enteredNumber; numeberOfStar > line; numeberOfStar--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

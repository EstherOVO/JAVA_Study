package Loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

/*
        은행 애플리케이션

        ------------------------------------
        1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        ------------------------------------
        선택>
        1. 번을 선택할 경우
        예금액> 10000    → 잔고에 10000원이 입금
        2. 번을 선택할 경우
        출금액> 1000     → 잔고에서 1000원이 출금
        3. 번
        잔고액> 9000     → 잔고액 확인가능
        4. 번
        "프로그램이 종료됩니다"
*/
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        for (int a = 1; a <= 4; a++) {
            System.out.println("------------------------------------");
            System.out.println("(1) 예금 | (2) 출금 | (3) 잔고 | (4) 종료");
            System.out.println("------------------------------------");
            System.out.print("몇 번을 누르시겠습니까? ");
            int enteredNumber = scanner.nextInt();

            switch (enteredNumber) {
                case 1 :
                    System.out.print(enteredNumber + "번을 누르셨습니다.\n" + "예금액을 입력해 주세요 : ");
                    int amount = scanner.nextInt();
                    balance += amount;
                    break;
                case 2 :
                    System.out.print(enteredNumber + "번을 누르셨습니다.\n" + "출금액을 입력해 주세요 : ");
                    int withdraw = scanner.nextInt();
                    balance -= withdraw;
                    break;
                case 3 :
                    System.out.print(enteredNumber + "번을 누르셨습니다.\n잔액은 총 " + balance + "원입니다.");
                    break;
                case 4 :
                    System.out.print(enteredNumber + "번을 누르셨습니다.\n종료하겠습니다.");
                    break;
            }
            System.out.println();
        }

    }
}

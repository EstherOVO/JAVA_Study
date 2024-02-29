package quiz.quiz01_0216;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {

        /*
        조건문 : 달러를 원으로 환전하는 간단한 프로그램을 만들어주세요.
        - Scanner 클래스를 사용하여 사용자 입력을 받습니다.
        - if 문을 사용하여 분기를 나눕니다.
        1. 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
        2. 양수일 때 환전금액은 "00000원입니다."
        3. 음수일 때 "잘못 입력하셨습니다"
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("환전하실 금액(달러)을 말씀해 주세요 : ");
        int enteredDollar = scanner.nextInt();

        System.out.print("환전하실 금액은 총 " + enteredDollar + "입니다. \n맞으면 \'Y\' / 틀리면 \'N\'을 입력해 주세요 : ");
        String answer = scanner.next();

        int exchangeWon = enteredDollar * 1335;
        switch (answer) {
            case "Y" :
                if (enteredDollar == 0) {
                    System.out.println("환전할 금액이 없습니다.\n금액을 확인해 주시기 바랍니다.");
                    break;
                } else if (enteredDollar > 0) {
                    System.out.println("총 환전 금액은 " + exchangeWon + "원 입니다.\n\n감사합니다.");
                    break;
                } else if (enteredDollar < 0) {
                    System.out.println("잘못된 금액입니다. 금액을 확인해 주시기 바랍니다.");
                    break;
                }
            case "N" :
                System.out.println("\'N\'을 클릭하셨습니다. 처음부터 다시 시도해 주시기 바랍니다.");
                break;
        }
    }
}

package quiz.quiz03_0308.q01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01_2 {
    public static void main(String[] args) {

        while (true) {

            try {

                Scanner scanner = new Scanner(System.in);

                System.out.print("결제하실 금액을 입력해 주세요 : ");
                int amount = scanner.nextInt();

                System.out.println("\n(1) 신용카드 결제 | (2) 은행 이체 | (3) 모바일 결제 | (4) 종료");
                System.out.print("결제 방법의 번호를 입력해 주세요 : ");
                int button = scanner.nextInt();

                clickPayment(amount, button);
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 시도해 주시기를 바랍니다.\n");
            } finally {
                System.out.println("감사합니다.\n");
            }
        }
    }

    public static void clickPayment(int amount, int button) {

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        switch (button) {
            case 1:
                paymentProcessor.setPayment(new CreditCard(), amount);
                break;
            case 2:
                paymentProcessor.setPayment(new BankTransfer(), amount);
                break;
            case 3:
                paymentProcessor.setPayment(new MobilePay(), amount);
                break;
            case 4 :
                System.out.println("종료합니다.");
                break;
        }
    }
}

package quiz.quiz03_0308.q1;

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
                System.out.println(e.getMessage());
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
            default :
                throw new InputMismatchException("다시 입력해 주시기를 바랍니다.");
        }
    }
}

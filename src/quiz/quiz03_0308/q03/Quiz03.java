package quiz.quiz03_0308.q03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("· 첫 번째 정수를 입력해 주세요 : ");
                double firstNumber = scanner.nextInt();

                System.out.print("· 두 번째 정수를 입력해 주세요 : ");
                double secondNumber = scanner.nextInt();

                validateNumber(secondNumber);

                double divide = firstNumber / secondNumber;

                System.out.printf("● 몫 : %,.2f", divide);
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("※ 유효한 숫자를 입력해 주세요.\n");
            }
        }
    }

    public static void validateNumber(double number) {
        if (number == 0) {
            throw new ArithmeticException("※ 0으로 나눌 수 없습니다.\n");
        }
    }
}

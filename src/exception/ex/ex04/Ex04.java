package exception.ex.ex04;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        try {
            printResult(setAnswer());
        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력입니다. 숫자로만 답해주세요.");
        }
    }

    static void printResult(int number) {

        switch (number) {
            case 0 :
                System.out.println("한 문제 맞추셨습니다.");
                break;
            case 1 :
                System.out.println("두 문제 맞추셨습니다.");
                break;
            case 2 :
                System.out.println("세 문제 맞추셨습니다.");
                break;
            default :
                System.out.println("모두 틀리셨습니다.");
        }
    }

    static int setAnswer() {

        Scanner scanner = new Scanner(System.in);

        int random1 = (int) (Math.random() * 10) * 1;
        int random2 = (int) (Math.random() * 10) * 1;
        int random3 = (int) (Math.random() * 10) * 1;
        int random4 = (int) (Math.random() * 10) * 1;
        int random5 = (int) (Math.random() * 10) * 1;
        int random6 = (int) (Math.random() * 10) * 1;

        int count = -1;
        int answer1 = random1 + random2;
        int answer2 = random3 - random4;
        int answer3 = random5 * random6;

        System.out.println("문제 1. : " + random1 + " + " + random2 + " = ");
        System.out.print("답 : ");
        int number1 = scanner.nextInt();

        System.out.println("문제 2. : " + random3 + " - " + random4 + " = ");
        System.out.print("답 : ");
        int number2 = scanner.nextInt();

        System.out.println("문제 3. : " + random5 + " * " + random6 + " = ");
        System.out.print("답 : ");
        int number3 = scanner.nextInt();

        int[] answers = {answer1, answer2, answer3};
        int[] numbers = {number1, number2, number3};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == numbers[i]) {
                count++;
            }
        }
        return count;
    }
}


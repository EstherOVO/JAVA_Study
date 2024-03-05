package exception.ex.ex04;

import java.util.Random;
import java.util.Scanner;

public class Calculate {

    int count = 0;
    int result1;
    int result2;
    int result3;

    public int setAnswer() {

        Scanner scanner = new Scanner(System.in);

        int[] randoms = new int[6];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (int) (Math.random() * 10) + 1;
        }

        result1 = randoms[0] + randoms[1];
        result2 = randoms[2] - randoms[3];
        result3 = randoms[4] * randoms[5];

        System.out.print("1번 문제) " + randoms[0] + " + " + randoms[1] + " = ");
        int answer1 = scanner.nextInt();

        System.out.print("2번 문제) " + randoms[2] + " - " + randoms[3] + " = ");
        int answer2 = scanner.nextInt();

        System.out.print("3번 문제) " + randoms[4] + " * " + randoms[5] + " = ");
        int answer3 = scanner.nextInt();

        int[] results = {result1, result2, result3};
        int[] answers = {answer1, answer2, answer3};

        for (int i = 0; i < results.length; i++) {
            if (results[i] == answers[i]) {
                count++;
            }
        }
        return count;
    }

    public void getResult() {

        System.out.println("■ 정답은..\n· 1번 문제 : " + result1 + "\n· 2번 문제 : " + result2 + "\n· 3번 문제 : " + result3);
    }

    public void printResult(int number) {

        switch (number) {
            case 0 :
                System.out.println("안타깝게도 모두 틀리셨습니다. 다시 한번 더 도전해 봅시다!");
                break;
            case 1 :
                System.out.println("한 문제를 맞췄습니다!");
                break;
            case 2 :
                System.out.println("두 문제를 맞췄습니다!");
                break;
            case 3 :
                System.out.println("세 문제 모두 맞췄습니다! 축하합니다~");
                break;
            default :
                System.out.println("다시 시도해 주시기를 바랍니다.");
                break;
        }
    }
}

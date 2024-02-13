package Loop;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

/*
        숫자 맞추기 게임
        1 ~ 100까지의 랜덤 숫자가 있습니다.
        응답한 숫자가 낮으면 낮다. 높으면 높다고 대답하여 랜덤 숫자를 추측합니다.
 */

        Random random = new Random();
        int answer = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("제가 생각한 숫자는 몇일까요 : ");
        int enteredNumber = scanner.nextInt();

        int tryCount = 0;

        for (int guessNumber = 1; guessNumber <= 100; guessNumber++) {
            if (answer > enteredNumber) {
                System.out.println("Up!");
                enteredNumber = scanner.nextInt();
            } else if (answer < enteredNumber) {
                System.out.println("Down!");
                enteredNumber = scanner.nextInt();
            } else if (enteredNumber == answer) {
                System.out.println("정답입니다!");
                break;
            }
        }

    }
}

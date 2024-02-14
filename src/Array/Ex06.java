package Array;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

/*
        배열에서 최댓값과 최솟값을 구하기
        정수를 n개 입력받아 배열에 저장하고,
        그중 가장 큰 수와 가장 작은 수를 구하는
        프로그램을 작성해 보세요.
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력하실 정수의 개수를 적어주세요 : ");
        int number = scanner.nextInt();

        System.out.println(number + "만큼의 정수를 입력해 주세요 : ");
        int[] numbers = new int[number];

        for (int k = 0; k < numbers.length; k++) {
            numbers[k] = scanner.nextInt();
        }

        scanner.close();

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("최대값 : " + max);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("최소값 : " + min);

    }
}

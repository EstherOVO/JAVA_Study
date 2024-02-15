package Method;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

//      세 수를 입력받아 합계와 평균을 구하는 메소드를 만들어주세요.
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int firstNumber = scanner.nextInt();

        System.out.print("두 번째 숫자 : ");
        int secondNumber = scanner.nextInt();

        System.out.print("두 번째 숫자 : ");
        int thirdNumber = scanner.nextInt();

        sum(firstNumber, secondNumber, thirdNumber);
        avg(firstNumber, secondNumber, thirdNumber);
    }

    public static int sum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("세 수의 합 : " + sum);
        return sum;
    }

    public static int avg(int x, int y, int z) {
        int sum = x + y + z;
        int avg = sum / 3;
        System.out.println("세 수의 평균 : " + avg);
        return avg;

    }
}

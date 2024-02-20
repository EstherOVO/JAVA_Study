package method;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

//      두 수를 입력받아 뺼셈을 하는 메서드를 만들어주세요.

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int firstNumber = scanner.nextInt();

        System.out.print("두 번째 숫자 : ");
        int secondNumber = scanner.nextInt();

        sub(firstNumber, secondNumber);
    }

    public static int sub(int x, int y) {
        int sub = x - y;
        System.out.println("두 수의 뺄셈 : " + sub);
        return sub;
    }
}

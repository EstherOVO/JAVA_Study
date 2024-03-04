package exception.ex.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        try {
            int age = setAge();
            System.out.println("접근이 허용되었습니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static int setAge() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요 : ");
        int age = scanner.nextInt();

        if (age < 18) {
            throw new InvalidAgeException(age);
        }
        return age;
    }
}

package exception.ex.ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        try {
            setEmail();
            System.out.println("이메일 주소가 유효합니다.");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

    }

    static String setEmail() throws InvalidEmailException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이메일을 입력해 주세요 : ");
        String email = scanner.next();

        if (!email.contains("@")) {
            throw new InvalidEmailException(email);
        }
        return email;
    }
}

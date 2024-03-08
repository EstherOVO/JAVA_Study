package quiz.quiz03_0308.q4;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

        while (true) {

            try {
                Scanner scanner = new Scanner(System.in);

                System.out.print("§ 이메일 주소를 입력해 주세요 : ");
                String email = scanner.next();

                validateEmail(email);

                System.out.println("이메일 주소가 확인되었습니다!");
                break;
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String validateEmail(String email) throws InvalidEmailException {

        if (!email.contains("@")) {
            throw new InvalidEmailException("※ 유효하지 않은 이메일입니다.\n입력하신 메일 주소를 확인해 주시기를 바랍니다.\n");
        }
        return email;
    }
}

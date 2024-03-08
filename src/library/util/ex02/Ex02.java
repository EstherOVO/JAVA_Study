package library.util.ex02;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {

/*
        연습 문제 2 : 랜덤 비밀번호 생성

        요구사항 :
        사용자로부터 비밀번호의 길이를 입력받아,
        해당 길이를 가진 랜덤 비밀번호를 생성하는 프로그램을 작성하세요.
        비밀번호는 대문자, 소문자, 숫자를 포함해야 합니다.

        입력 예시:
        8

        출력 예시:
        생성된 비밀번호: X7gA2fHq

        힌트 :
        비밀번호에 사용될 문자 세트
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
*/

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("원하시는 암호의 길이를 입력해 주세요 : ");
            int length = scanner.nextInt();

            try {
                validatePassword(length);
                String randomPassword = getRandomPassword(length);

                System.out.println(randomPassword);
                break;
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String getRandomPassword(int length) {

        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();

        if (length < 3) {
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(charSet.length());
                sb.append(charSet.charAt(index));
            }
            return sb.toString();
        } else {
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(charSet.length());
                sb.append(charSet.charAt(index));
            }

            String pattern = ".*[0-9].*" + ".*[A-Z].*" + ".*[a-z].*";

            if (!Pattern.matches(pattern, sb.toString())) {
                return getRandomPassword(length);
            }
        }
        return sb.toString();
    }

    public static void validatePassword(int length) throws InvalidPasswordException {

        if (length <= 0) {
            throw new InvalidPasswordException("길이는 한 자릿수 이상의 정수로 입력해 주시기를 바랍니다.\n");
        }
    }
}

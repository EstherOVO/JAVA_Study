package lambda.ex;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Function;

public class Ex03_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("생년월일을 입력하세요(YYYYMMDD) : ");
        String input = scanner.nextLine();

        Function<String, Integer> age = Ex03_2::calculateAge;

        System.out.println("2024년 기준 나이 : " + age.apply(input) + "세");
    }

    public static int calculateAge(String birth) {
        int year = Integer.parseInt(birth.substring(0, 4));
        int month = Integer.parseInt(birth.substring(4, 6));
        int day = Integer.parseInt(birth.substring(6, 8));

        LocalDate birthDay = LocalDate.of(LocalDate.now().getYear(), month, day);

        return LocalDate.now().isBefore(birthDay) ? (2023 - year) : (2024 - year);
    }
}

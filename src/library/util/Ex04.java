package library.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

/*

        연습 문제 1 : 다가오는 생일까지 남은 날짜 계산하기

        요구사항 :
        사용자로부터 생년월일을 입력받아, 올해의 생일이 지났는지 여부에 따라
        올해 또는 내년 생일까지 남은 날짜를 계산하여 출력하세요.
        사용자의 생년월일과 현재 날짜에 LocalDate를 사용하고,
        남은 날짜 계산에는 Period 클래스를 활용하세요.

        입력 예시 : 1990-05-24

        출력 예시 (올해 생일이 지났을 경우) :
        다음 생일까지 240일 남았습니다!

        출력 예시 (올해 생일이 아직 안 지났을 경우) :
        다음 생일까지 30일 남았습니다!
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("생년월일을 입력해 주세요 : ");
        String input = scanner.nextLine();

        String[] birth = input.split("-");
        int month = Integer.parseInt(birth[1]);
        int day = Integer.parseInt(birth[2]);

        LocalDate now = LocalDate.now();
        LocalDate thisBirthDay = LocalDate.of(now.getYear(), month, day);
        LocalDate nextBirthDay = LocalDate.of(now.getYear() + 1, month, day);

        if (now.isBefore(thisBirthDay)) {
            long nowToThisBirthDay = now.until(thisBirthDay, ChronoUnit.DAYS);
            System.out.println("오늘부터 생일까지 %d일 남았습니다!".formatted(nowToThisBirthDay));
        } else if (now.isAfter(thisBirthDay)) {
            long nowToNextBirthDay = now.until(nextBirthDay, ChronoUnit.DAYS);
            System.out.println("생일이 지났네요. 오늘부터 다음 생일까지 %d일 남았습니다!".formatted(nowToNextBirthDay));
        }
    }
}

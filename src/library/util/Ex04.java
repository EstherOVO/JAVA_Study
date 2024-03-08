package library.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
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

        System.out.print("생년월일을 입력해 주세요(YYYY-MM-DD일 형식) : ");
        String birth = scanner.nextLine();

        String[] strings = birth.split("-");

        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);

        LocalDate now = LocalDate.now();
        LocalDate thisBirthDay = LocalDate.of(now.getYear(), month, day);
        LocalDate nextBirthDay = LocalDate.of(now.getYear() + 1, month, day);

        if (LocalDate.now().isBefore(thisBirthDay)) {
            Period between1 = Period.between(now, thisBirthDay);
            long onlyDays1 = now.until(thisBirthDay, ChronoUnit.DAYS);
            int days1 = between1.getDays();
            int months1 = between1.getMonths();
            System.out.println(String.format("생일까지 남은 기간은 %d개월 %d일입니다! (총 %d일)", months1, days1, onlyDays1));
        } else {
            Period between2 = Period.between(now, nextBirthDay);
            long onlyDays2 = now.until(nextBirthDay, ChronoUnit.DAYS);
            int days2 = between2.getDays();
            int months2 = between2.getMonths();
            System.out.println(String.format("다음 생일까지 남은 기간은 %d개월 %d일입니다! (총 %d일)", months2, days2, onlyDays2));
        }
    }
}

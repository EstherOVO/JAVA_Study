package quiz.quiz04_0315.q03;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Quiz03 {
    public static void main(String[] args) {

        LocalDate worldCup = LocalDate.of(2026, 6, 14);

        Period period = Period.between(LocalDate.now(), worldCup);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        long until = LocalDate.now().until(worldCup, ChronoUnit.DAYS);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");

        System.out.println("= 월드컵 D-DAY =");
        System.out.println("다음 월드컵까지 %d년 %d개월 %d일(총 %d일) 남았습니다!".formatted(years, months, days, until));
    }
}

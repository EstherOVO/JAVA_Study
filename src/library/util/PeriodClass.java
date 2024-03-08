package library.util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodClass {
    public static void main(String[] args) {
//      Period 날짜 간격 구하기
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);

        Period startToEnd1 = Period.between(startDate, endDate);
        System.out.println("startToEnd = " + startToEnd1);
        int months = startToEnd1.getMonths();
        int days = startToEnd1.getDays();
        System.out.printf("날짜 간격은 %d개월 %d일입니다.\n", months, days);

//      Duration 시간 간격 구하기
        LocalTime startTime = LocalTime.of(8, 30);
        LocalTime endTime = LocalTime.of(17, 00);

        Duration startToEnd2 = Duration.between(startTime, endTime);
        System.out.println("startToEnd2 = " + startToEnd2);
        System.out.printf("시간 간격은 %d시간 %d분입니다. ", startToEnd2.toHours(), startToEnd2.toMinutesPart());
        System.out.println("분으로 계산하면 총 " + startToEnd2.toMinutes() + "분입니다.");
    }
}

package library.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

/*
        연습 문제 3 : 국제 회의 시간대 출력

        요구사항 : 뉴욕에서 오후 3시에 시작하는 온라인 회의가 있다고 할 때,
        이 회의가 서울과 런던에서 몇 시에 시작하는지 계산하여 출력하세요.
        ZonedDateTime과 ZoneId를 사용하여 시간대 변환을 수행하세요.

        출력 예시 :
        회의는 뉴욕 기준 오후 3시에 시작합니다.
        서울에서는 회의가 오전 5시에 시작합니다.
        런던에서는 회의가 오후 8시에 시작합니다.
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("회의 날짜를 입력해 주세요(YYYY-MM-DD 형식) : ");
        String date = scanner.nextLine();

        System.out.print("회의 시간을 입력해 주세요(24시간을 기준으로 HH:MM 형식) : ");
        String time = scanner.nextLine();

        String[] strings = date.split("-");
        String[] strings2 = time.split(":");

        int year = Integer.parseInt(strings[0]);
        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);
        int hour = Integer.parseInt(strings2[0]);
        int mm = Integer.parseInt(strings2[1]);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime newYork = Year.of(year).atMonth(month).atDay(day).atTime(hour, mm).atZone(ZoneId.of("America/New_York"));
        System.out.println("(미국 뉴욕 기준) 회의 시간 : " + formatter.format(newYork));

        ZonedDateTime seoul = newYork.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        System.out.println("서울(대한민국) 시간 : " + formatter.format(seoul));

        ZonedDateTime london = newYork.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던(영국) 시간 : " + formatter.format(london));

        ZonedDateTime vancouver = newYork.withZoneSameInstant(ZoneId.of("America/Vancouver"));
        System.out.println("밴쿠버(캐나다) 시간 : " + formatter.format(vancouver));

    }
}

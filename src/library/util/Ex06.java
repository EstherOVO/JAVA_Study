package library.util;

import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
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

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println(("(1) 한국 | (2) 미국 | (3) 스페인"));
                System.out.print("회의가 열리는 기준 국가 번호를 입력해 주세요 : ");
                int nation = scanner.nextInt();

                System.out.print("회의 날짜를 입력해 주세요(YYYY-MM-DD) : ");
                String date = scanner.next();

                System.out.print("회의 시간을 입력해 주세요(24시간제로 입력) : ");
                String time = scanner.next();

                String[] strDate = date.split("-");
                String[] strTime = time.split(":");

                int[] dates = new int[3];
                for (int i = 0; i < strDate.length; i++) {
                    dates[i] = Integer.parseInt(strDate[i]);
                }

                int[] times = new int[2];
                for (int i = 0; i < strTime.length; i++) {
                    times[i] = Integer.parseInt(strTime[i]);
                }

                switch (nation) {
                    case 1 :
                        kst(dates, times);
                        break;
                    case 2 :
                        ust(dates, times);
                        break;
                    case 3 :
                        cet(dates, times);
                        break;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("다시 시도해 주시기를 바랍니다.");
                continue;
            }
        }
    }

    public static void kst(int[] dates, int[] times) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime seoul = Year.of(dates[0]).atMonth(dates[1]).atDay(dates[2]).atTime(times[0], times[1]).atZone(ZoneId.of("Asia/Seoul"));

        ZonedDateTime newYork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime madrid = seoul.withZoneSameInstant(ZoneId.of("Europe/Madrid"));

        System.out.println("▣ 주최국(대한민국 서울) 기준 회의 시간 : " + formatter.format(seoul));
        System.out.println("[미국 뉴욕] 회의 시간 : " + formatter.format(newYork));
        System.out.println("[스페인 마드리드] 회의 시간 : " + formatter.format(madrid));
    }

    public static void ust(int[] dates, int[] times) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime newYork = Year.of(dates[0]).atMonth(dates[1]).atDay(dates[2]).atTime(times[0], times[1]).atZone(ZoneId.of("America/New_York"));

        ZonedDateTime seoul = newYork.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        ZonedDateTime madrid = newYork.withZoneSameInstant(ZoneId.of("Europe/Madrid"));

        System.out.println("▣ 주최국(미국 뉴욕) 기준 회의 시간 : " + formatter.format(newYork));
        System.out.println("[대한민국 서울] 회의 시간 : " + formatter.format(seoul));
        System.out.println("[스페인 마드리드] 회의 시간 : " + formatter.format(madrid));
    }

    public static void cet(int[] dates, int[] times) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        ZonedDateTime madrid = Year.of(dates[0]).atMonth(dates[1]).atDay(dates[2]).atTime(times[0], times[1]).atZone(ZoneId.of("Europe/Madrid"));

        ZonedDateTime seoul = madrid.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        ZonedDateTime newYork = madrid.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("▣ 주최국(스페인 마드리드) 기준 회의 시간 : " + formatter.format(madrid));
        System.out.println("[대한민국 서울] 회의 시간 : " + formatter.format(seoul));
        System.out.println("[미국 뉴욕] 회의 시간 : " + formatter.format(newYork));
    }
}

package library.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormat {
    public static void main(String[] args) {
//      날짜와 시간을 원하는 형식으로 지정하기
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");

//      날짜 시간에 미리 만들어 둔 포매터에 적용
        String formatted1 = now.format(formatter1);
        System.out.println("formatted1 = " + formatted1);

        String formatted2 = now.format(formatter2);
        System.out.println("formatted2 = " + formatted2);

//      날짜와 시간 형식의 문자열을 DateTime 타입으로 변환
        LocalDateTime parsedDateTime = LocalDateTime.parse(formatted1, formatter1);
        System.out.println("parsedDateTime = " + parsedDateTime);

        String str = "2024년 3월 8일 13시 16분 23초";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(str, fmt);
        System.out.println("parse = " + parse);
    }
}

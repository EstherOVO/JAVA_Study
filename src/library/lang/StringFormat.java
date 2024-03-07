package library.lang;

import java.text.MessageFormat;
import java.util.Calendar;

public class StringFormat {
    public static void main(String[] args) {

//      문자열 포매팅하기
        String name = "홍길동";
        int age = 30;

//      1. printf() : 형식지정자를 문자열에 % 기호를 사용하여 삽입할 위치와 방식 지정
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);

//      2. String.format() : 포매팅된 문자열로 반환
        String formatteredStr = String.format("이름 : %s, 나이 : %d", name, age);
        System.out.println(formatteredStr);

//      3. MessageFormat.format : 복잡한 포매팅이 필요할 때
        String formatteredStr2 = MessageFormat.format("나이 : {1}, 이름 : {0}", name, age);
        System.out.println(formatteredStr2);

//      4. "문자열".formatted("포맷") : 포맷된 문자열을 반환 ※ 자바 13버전부터 추가됨!
        String formatted = "이름 : %s, 나이 : %d\n".formatted(name, age);
        System.out.println(formatted);

//      문자열 포매팅 예시
//      숫자 또는 금액 포매팅(%, 천 단위로 콤마 형식을 넣어준다. 그리고 %.n 부동소수점 자리수를 말한다.)
        double dollarPrice = 1234.5678;
        String fmt1 = String.format("가격 : %,.2f 달러", dollarPrice);
        System.out.println(fmt1);

//      날짜 시간 포매팅 1$ = 첫 번째 인자를 사용하겠다.
//      %tY %tm %td : 연 월 일 형식지정자
//      1$ 2$ 3$ : 1번 째, 2번 째 3번 째 인자를 사용하겠다는 의미다.(인자 순서가 맞으면 사용할 필요 없음)
        Calendar now = Calendar.getInstance();
        String fmt2 = String.format("현재 날짜 : %1$tY년 %1$tm월 %1$td일", now);
        System.out.println(fmt2);

//      패딩 간격과 정렬하기
//      %숫자s : 숫자만큼의 자리를 차지(기본 우측정렬)
//      %-숫자s : 자리를 차지하고 좌측정렬
        String fmt3 = String.format("이름 : [[%10s]]", name);
        System.out.println(fmt3);

//      대문자 변환하기
//      %S : 영문자 대문자 변환
        String hello = "Hello Java";
        String fmt4 = String.format("인사말 : %S", hello);
        System.out.println(fmt4);

//      자료형에 따른 형식지정자
//      %s : 문자열, %d : 정수, %f : 실수
        int year = 2024;
        double temp = 12.3;
        String fmt5 = String.format("연도 : %d, 온도 : %.1f", year, temp);
        System.out.println(fmt5);
    }
}

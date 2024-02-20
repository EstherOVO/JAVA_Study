package variable;

public class Print01 {
    public static void main(String[] args) {

//      System.out.println(); : "시스템 출력 장치로 매개변수를 출력하고, 행(ln)을 변경하라."는 의미
//      System.out.print();   : "행(ln)을 변경하지 않고 출력하라."는 의미

        System.out.println("println");
        System.out.print("println");

        System.out.printf("이름 : %s", "홍길동");    // 형식 문자열을 출력

/*
      ◎ 자주 사용되는 형식 문자열
        - %s : 문자열 %10s 열자리 문자열 형식
        - %d : 정수 %10d 열자리 정수
        - %f : 실수 %10f 열자리 실수
 */

        System.out.printf("%10s", "홍길동");
        System.out.printf("%10d", 100);
        System.out.printf("%10.2f", 10.0);  // 기본 소수점 값 6자리까지 출력 EX) '%10.2f'는 소수점 2자리까지 출력

    }
}

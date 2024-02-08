package Operator;

public class Operator08 {
    public static void main(String[] args) {

//      문자열 비교
        String s1 = "안녕";
        String s2 = "하세요.";
        String s3 = "안녕";

        boolean b1 = s1 == s2;  // false
        System.out.println("r1 = " + b1);

        boolean b2 = s1 == s3;  // true
        System.out.println("r2 = " + b2);

        boolean r3 = "안녕".equals("안녕"); // true
        System.out.println("r3 = " + r3);

        boolean r4 = "안녕".equals(s2);    // false
        System.out.println("r4 = " + r4);

//      문자열 비교는 equals method를 사용하는 것이 더 안전하다.

    }
}

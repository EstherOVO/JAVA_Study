package method;

public class Overloading01 {
    public static void main(String[] args) {

/*
    자바 메소드 오버로딩 : 같은 이름의 메소드를 여러 개 정의하는 것
    - 메소드의 이름은 같지만 매개변수의 개수가 다르거나, 타입이 다르면 오버로딩이 가능하다.
    - 메소드의 이름이 같아도 타입의 순서가 다르면 오버로딩이 가능하다.
    - 리턴 타입만 다를 경우에는 오버로딩이 되지 않는다.
*/

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 2));
        System.out.println(add(1.0, 2.0));
        System.out.println(add(1, 1.0));
        System.out.println(add(1.0, 1));
        System.out.println(add("1", "2"));
    }

//  타입 이름 같음 (정수 - 정수)
    public static int add(int x, int y) {
        System.out.print("두 정수를 더하는 메소드_결과 : ");
        return x + y;
    }

//  타입 이름 같음 (정수 - 정수 - 정수)
    public static int add(int x, int y, int z) {
        System.out.print("세 정수를 더하는 메소드_결과 : ");
        return x + y + z;
    }

//  타입 이름 같음 (실수 - 실수)
    public static double add(double x, double y) {
        System.out.print("두 실수를 더하는 메소드_결과 : ");
        return x + y;
    }

//  타입 이름 같음 (정수 - 실수)
    public static double add(int x, double y) {
        System.out.print("정수 - 실수를 더하는 메소드_결과 : ");
        return x + y;
    }

//  타입 이름 같음 (실수 - 정수)
    public static double add(double x, int y) {
        System.out.print("실수 - 정수를 더하는 메소드_결과 : ");
        return x + y;
    }

//  두 문자열을 더하는 메소드
    public static String add(String x, String y) {
        System.out.print("두 문자열을 더하는 메소드_결과 : ");
        return x + y;
    }
}

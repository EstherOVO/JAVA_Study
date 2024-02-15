package Method;

public class Method04 {
    public static void main(String[] args) {

        boolean result1 = isOdd(3);
        boolean result2 = isOdd(4);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    public static boolean isOdd(int number) {
//  홀수면 true, 짝수면 false를 반환(리턴)하는 메소드

        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

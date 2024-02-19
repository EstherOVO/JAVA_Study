package Method;

public class Method06 {
    public static void main(String[] args) {

        int number = 3;
        System.out.println("메소드 호출 전 : " + number);
        number = multiply2(number);  // 메소드 리턴 값을 메소드의 number에 대입
        System.out.println("메소드 호출 후 : " + number);
    }

    public static int multiply2(int number) {
        System.out.println("메소드 호출 연산 실행 전 : " + number);
        number = number * 2;
        return number;
    }
}

package exception;

public class Try03 {
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[3];    // 예외 발생 가능 코드 : ArrayIndexOutOfBoundsException
//          예외가 발생할 경우 발생한 예외 이후 코드 구문은 실행하지 않고 catch 블록으로 넘어간다.

            int dividedNumber = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위가 초과됐습니다. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. " + e.getMessage());
        }
    }
}

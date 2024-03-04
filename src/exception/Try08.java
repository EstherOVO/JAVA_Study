package exception;

public class Try08 {
    public static void main(String[] args) {

//      다중 catch문의 순서
//      예외 클래스는 상속 계층 구조를 가지기 때문에
//      catch 블록의 순서는 구체적인 예외 → 일반적인 예외(부모 클래스)

        try {
            int[] numbers = {1, 2, 3};
            int dividedNumber = numbers[1] / (numbers[1] - 2);  // ArithmeticException
            System.out.println(numbers[3]);     // ArrayIndexOutOfBoundsException
        } catch (Exception e) {
//          모든 예외를 catch
            System.out.println("예외가 발생했습니다."); }
//        catch (ArithmeticException e) { → 컴파일 에러
//          System.out.println("0으로 나눌 수 없습니다."); }
//        catch (ArrayIndexOutOfBoundsException e) { → 컴파일 에러
//          System.out.println("배열 범위를 넘어섰습니다.");

//      따라서...
        try {
            int[] numbers = {1, 2, 3};
            int dividedNumber = numbers[1] / (numbers[1] - 2);  // ArithmeticException
            System.out.println(numbers[3]);     // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
//        구체적인 예외 1
            System.out.println("배열 범위를 넘어섰습니다.");
        } catch (Exception e) {
//        구체적인 예외 2
            System.out.println("예외가 발생했습니다.");
        }
    }
}

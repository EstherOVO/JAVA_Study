package exception;

public class Try04 {
    public static void main(String[] args) {

        String str = null;  // // 예외 발생 가능 코드 : NullPointerException

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
//      System.out.println(str.length());      예외 처리가 되지 않은 경우
        System.out.println("이후 로직...");  // 예외 발생 이후 로직은 실행 불가
    }
}

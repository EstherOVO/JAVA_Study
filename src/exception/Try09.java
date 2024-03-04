package exception;

public class Try09 {
    public static void main(String[] args) {

        String[] array = {"110", "1IO", null, "310", "3IO"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int length = array[i].length();
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
//            두 개 이상의 예외를 하나의 catch 블록으로 처리하고 싶을 떼
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("데이터에 문제가 있어 숫자로 변경 불가능합니다.");
           // catch (NullPointerException e) {
             // System.out.println("데이터가 null이기 대문에 길이 확인이 불가능합니다.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다.");
            } catch (Exception e) {
                System.out.println("예외가 발생했습니다. " + e.getMessage());
            }
        }
    }
}

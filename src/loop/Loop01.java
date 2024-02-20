package loop;

public class Loop01 {
    public static void main(String[] args) {

/*
        반복문 while
        while (조건식) {
           반복할 코드 → 조건식이 true일 때 반복할 코드
           - false일 경우 while문을 벗어난다.
           - 조건식이 false가 되는 경우가 없으면 무한 반복한다.
*/

/*
        int count = 0;

        count++;
        System.out.println("count = " + count);
        count++;
        System.out.println("count = " + count);
        count++;
        System.out.println("count = " + count);
        count++;
        System.out.println("count = " + count);
 */

        int count = 0;      // 초기값

        while (count < 3) { // 조건식
            count++;        // 증감식
            System.out.println("count = " + count);
        }

    }
}

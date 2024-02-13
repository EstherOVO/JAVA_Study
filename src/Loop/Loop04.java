package Loop;

public class Loop04 {
    public static void main(String[] args) {

/*
        break문
        while (조건식) {
            code 1
            break; → code2를 실행하지 않고 반복문을 종료한다.
            code 2
        }
*/

        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
//          만약 i가 10보다 크다는 조건을 만족하면 break문이 수행되고 while문은 종료가 된다.
            if (i > 10) {
                System.out.println("sum = " + sum);
                break;
            }
            i++;
        }

    }
}

package Loop;

public class Loop02 {
    public static void main(String[] args) {

/*
        1부터 하나씩 증가하는 수를 더하기

        int sum = 0;
        int i = 1;

        sum = sum + i;
        System.out.println("sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("sum = " + sum);
        i++;
 */

//      반복문을 사용하게 될 경우, 반복 횟수와 요구 조건을 유연하게 변경할 수 있다.
        int sum = 0;
        int i = 1;
        int end = 3;

        while (i <= end) {
            sum += i;
            i++;
        }

        System.out.println("sum = " + sum);

    }
}

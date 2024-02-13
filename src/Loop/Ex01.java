package Loop;

public class Ex01 {
    public static void main(String[] args) {

//      반복문을 이용해서 20 이내의 짝수를 출력해 주세요.
//      증감식의 경우 1씩 증가 대신 다른 증감 대입이 가능하다.

        System.out.print("1 ~ 20 이내의 짝수 :" );
        for (int even = 1; even <=20; even++) {
            if (even % 2 == 0) {
                System.out.print(" " + even);
            }
        }

    }
}
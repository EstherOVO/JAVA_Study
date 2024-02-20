package operator;

public class Operator04 {
    public static void main(String[] args) {

//      증감 연산자(increment and decrement operators)

        int x = 0;

        x = x + 1;  // 1 증가
        System.out.println("x = " + x);
        x = x + 1;
        System.out.println("x = " + x);

        ++x;    // x = x + 1
        System.out.println("x = " + x);
        x++;    // x = x + 1
        System.out.println("x = " + x);
        --x;
        System.out.println("x = " + x);
        x--;
        System.out.println("x = " + x);

    }
}

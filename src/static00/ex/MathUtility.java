package static00.ex;

public class MathUtility {

    private int a;
    private int b;

    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int min(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


}

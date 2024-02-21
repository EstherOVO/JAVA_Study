package static00.ex;

public class MathArrayUtils_Ex03 {

    public static void main(String[] args) {

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum = " + MathArrayUtils.getSum(values));
        System.out.println("average = " + MathArrayUtils.getAvg(values));
        System.out.println("min = " + MathArrayUtils.getMin(values));
        System.out.println("max = " + MathArrayUtils.getMax(values));
    }
}

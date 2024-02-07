package Variable;

public class Type05 {
    public static void main(String[] args) {

        byte v1 = 10;
        int v2 = 100;
        long v3 = 1000L;

        long result = v1 + v2 + v3;
//      int result = v1 + v2 + v3;          // 작은 타입으로 담을 시 compile error 발생
        int result2 = (int) (v1 + v2 + v3); // Casting을 통해 변환 가능
        System.out.println(result);
        System.out.println(result2);

        int v4 = 10 / 4;
        System.out.println("v4 = " + v4);

//      int v5 = 10 / 4.0;    // compile error
//      double v6 = 10 / 4;   // 2.0 → literal 'int / int'로 인식
        double v6 = 10 / 4.0; // 2.5 → 'int / double'의 경우 double이 더 크기 때문에 double 타입으로 인식
        System.out.println("v6 = " + v6);

    }
}

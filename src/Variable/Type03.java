package Variable;

public class Type03 {
    public static void main(String[] args) {

//      자동 타입 변환 : 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 사용
//      (제일 큼) double > float > long > int > short > byte (제일 작음)
//      정수 타입이 실수 타입으로 저장될 경우 무조건 자동 타입 변환

        byte b = 10;
        int i = b;     // 자동으로 타입 변환
        long l = i;    // 자동으로 타입 변환
        float f = l;   // 자동으로 타입 변환
        double d = f;  // 자동으로 타입 변환

        System.out.println("b = " + b);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);

    }
}

package variable;

public class Type07 {
    public static void main(String[] args) {

//      (문자열 → 기본타입) 문자열을 기본타입으로 자체 변환
        String s1 = "600000";
        int i1 = Integer.parseInt(s1);

        double d1 = Double.parseDouble("3.14");

        boolean b = Boolean.parseBoolean("true");

//      (기본타입 → 문자열) 기본타입을 문자열로 강제 변환
        String s = String.valueOf(100);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(true);

    }
}

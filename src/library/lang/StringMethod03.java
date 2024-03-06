package library.lang;

public class StringMethod03 {
    public static void main(String[] args) {

        String hello1 = "Hello, World";
        String hello2 = "hello, world";
        String hello3 = "HELLO, WORLD";

//      7. equals() : 문자열이 동등한지 비교해 준다.
        boolean res1 = hello1.equals(hello2);   // false
        boolean res2 = hello1.equals(hello3);   // false

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

//      8. equalsIgnoreCase() : 대소문자 무시하고 동등 비교해 준다.
        boolean res3 = hello1.equalsIgnoreCase(hello2);
        boolean res4 = hello1.equalsIgnoreCase(hello3);

        System.out.println("res3 = " + res3);   // true
        System.out.println("res4 = " + res4);   // true

//      9. contains() : 문자 포함 여부를 확인해 준다.
        String str = "시계가 고장났을 때 하는 말은.. 똑똑";

        boolean res5 = str.contains("시계");  // true
        boolean res6 = str.contains("회중시계");   // false
        boolean res7 = str.contains("고장");  // true

//      10. startsWith() : 해당 문자로 문자열이 시작되는지 확인해 준다.
        boolean res8 = str.startsWith("시계");    // true
        boolean res9 = str.startsWith("고장");    // false
//      두 번째 인자로 받는 인덱스 위치부터 확인
        boolean res10 = str.startsWith("시계", 3);    // false
        boolean res11 = str.startsWith("고장", 4);    // true

//      11. endsWith() : 해당 문자로 문자열이 끝나는지 확인해 준다.
        boolean res12 = str.endsWith("똑똑"); // true
        boolean res13 = str.endsWith("시계"); // false

//      12. matches() : 정규식을 이용하여 매치되는 여부를 확인해 준다.
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        String email1 = "normal@example.com";
        String email2 = "abnormal_example.com";
        String email3 = "abnormal@example@com";

        boolean res14 = email1.matches(regex);  // true
        boolean res15 = email2.matches(regex);  // false
        boolean res16 = email3.matches(regex);  // false
    }
}

package Condition;

public class Condition11 {
    public static void main(String[] args) {

//      삼항 연산자도 조건문처럼 사용 가능하다.
//      if문과 비교하여 코드를 간결하게 만들 수 있다.

        int age = 17;
        String status = (age >= 18) ? "성인입니다." : "미성년자입니다.";

        System.out.println(status);

    }
}

package condition;

public class Condition01 {
    public static void main(String[] args) {

//      if age >= 18 "성인입니다." (만약 나이가 18살 이상이면 성인입니다.)
//      if age < 18 "미성년자입니다." (만약 나이가 18살 이하면 미성년자입니다.)

//      if 조건문(condition) : 해당 조건이 참일 때 실행되는 코드

        int age = 20;

        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }

    }
}
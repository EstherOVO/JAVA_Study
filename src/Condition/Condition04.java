package Condition;

public class Condition04 {
    public static void main(String[] args) {

        int age = 25;

        if (age < 8) {
            System.out.println("미취학 아동입니다.");
        }
        else if (age <= 13) {
            System.out.println("초등학생입니다.");
        }
        else if (age <= 16) {
            System.out.println("중학생입니다.");
        }
        else if (age <= 19) {
            System.out.println("고등학생입니다.");
        }
        else {
            System.out.println("성인입니다.");
        }

    }
}

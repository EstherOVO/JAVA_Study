package Method;

public class Method04 {

    public static void main(String[] args) {

        checkAge(10);
        checkAge(25);
    }

    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println("미성년자입니다. 주류 및 담배 구매가 불가합니다.");
        } else {
            System.out.println("성인입니다. 주류 및 담배 구매가 가능합니다.");
        }
    }
}

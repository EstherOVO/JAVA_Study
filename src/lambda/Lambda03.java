package lambda;

public class Lambda03 {
    public static void main(String[] args) {

//      매개변수는 없고, 반환 값만 있는 람다식
        Returner returner1 = () -> { return "반환값"; };

        Returner returner2 = () -> "반환식만 있을 경우 괄호와 return 생략 가능";

        System.out.println(returner1.returnObject());

        System.out.println(returner2.returnObject());
    }
}

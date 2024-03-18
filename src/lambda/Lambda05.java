package lambda;

public class Lambda05 {
    public static void main(String[] args) {

//      매개변수가 2개인 람다식
        ParamTwo add = (x, y) -> x + y;

        System.out.println("x + y = " + add.func(10, 20));

//      본문이 여러 줄인 경우, {} 추가 return 값 필수!
        ParamTwo addAndPrint = ((x, y) -> {
            int result = x + y;
            System.out.println("x + y = " + result);    // 순수 함수가 아님
            return result;
        });

        addAndPrint.func(30, 40);
    }
}

package lambda.function01;

public class Function02 {
    public static void main(String[] args) {

//      매개변수가 없고, 리턴 값이 없음
        Runnable dogSound = () -> System.out.println("멍멍");
        Runnable duckSound = () -> System.out.println("꽥꽥");

        dogSound.run();
        duckSound.run();

        Button dogButton = new Button("강아지");
//      클릭 리스너의 매개변수에 "함수"를 입력 : 기존 선언된 변수
        dogButton.setOnClickListener(dogSound);
        dogButton.onClick();

//      클릭 리스너의 매개변수에 "함수"를 설정 : 람다식으로 새로 선언
        Button duckButton = new Button("오리");
        duckButton.setOnClickListener(() -> {
            System.out.println("======================");
            System.out.println(duckButton.getText() + "의 울음소리");
            System.out.println("꽥꽥");
        });

        duckButton.onClick();
    }
}

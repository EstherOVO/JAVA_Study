package quiz.quiz03_0308.q2;

public class Quiz02 {

    public static void main(String[] args) {

        Button button = new Button();

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다.");
            }
        });

        button.touch();
    }
}
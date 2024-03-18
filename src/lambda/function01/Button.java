package lambda.function01;

public class Button {

//  필드
    private String text;    // 필드의 이름
    private Runnable onClickListener;   // 람다식 함수

//  생성자
    public Button(String text) {
        this.text = text;
    }

    public void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }

    public String getText() {
        return text;
    }

    public void onClick() {
        onClickListener.run();
    }
}

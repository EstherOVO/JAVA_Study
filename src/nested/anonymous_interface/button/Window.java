package nested.anonymous_interface.button;

public class Window {

    Button button1 = new Button();
    Button button2 = new Button();

//  생성자에서 클릭 리스너를 초기화
    Window() {
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("통화를 연결합니다.");
            }
        });

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 전송합니다.");
            }
        });
    }
}

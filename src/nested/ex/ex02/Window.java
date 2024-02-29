package nested.ex.ex02;

import nested.ClickFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    Button button = new Button();

    Window() {
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        });
    }
}

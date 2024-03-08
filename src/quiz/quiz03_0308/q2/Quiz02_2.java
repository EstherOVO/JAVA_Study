package quiz.quiz03_0308.q2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz02_2 extends JFrame {

    private JButton button;

    public Quiz02_2() {
        this.setTitle("버튼 이벤트");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("클릭해 주세요.");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("클릭해 주세요.")) {
                    button.setText("클릭되었습니다!");
                } else {
                    button.setText("클릭해 주세요.");
                }
            }
        });

        this.add(button);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new Quiz02_2();
    }
}

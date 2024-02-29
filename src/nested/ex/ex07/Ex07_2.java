package nested.ex.ex07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07_2 extends JFrame {

    private JButton btn;

    public Ex07_2() {
        this.setTitle("버튼 이벤트");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn = new JButton("클릭해 보세요.");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("클릭해 보세요.")) {
                    btn.setText("버튼이 클릭되었습니다!");
                } else {
                    btn.setText("클릭해 보세요.");
                }
            }
        });

        this.add(btn);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ex07_2();
    }
}

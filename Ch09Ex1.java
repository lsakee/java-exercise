package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ch09Ex1 extends JFrame {
    JLabel la = new JLabel("사랑해");
    public Ch09Ex1() {
        setTitle("이삭 실습문제 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(la);
        la.addMouseListener(new MyMouse());
        setSize(300, 150);
        setVisible(true);
    }
    class MyMouse extends MouseAdapter{

        @Override
        public void mouseEntered(MouseEvent e) {
           la.setText("사랑해");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            la.setText("좋아해");
        }
    }

    public static void main(String[] args) {
        new Ch09Ex1();
    }
}

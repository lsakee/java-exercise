package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ch09Ex3 extends JFrame {
    Container c = getContentPane();
    public Ch09Ex3() {
        setTitle("이삭 실습문제 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.GREEN);
        c.addMouseListener(new MyMouse());
        setSize(300, 150);
        setVisible(true);

    }
    class MyMouse extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Ch09Ex3();
    }
}
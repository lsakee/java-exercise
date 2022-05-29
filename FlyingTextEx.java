package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FlyingTextEx extends JFrame{
    private JLabel la = new JLabel("HELLO");
    public FlyingTextEx() {
        setTitle("[이삭]9-7예제 상, 하, 좌, 우 키");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());
        la.setLocation(50,50);
        la.setSize(100,20);   c.add(la);   setSize(300,300);   setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
        setAutoRequestFocus(false);

    }
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY()- 10); break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY()+ 10); break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX()- 10, la.getY()); break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX()+ 10, la.getY()- 10); break;
            }
        }

    }
    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
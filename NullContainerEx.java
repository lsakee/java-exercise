package ch8;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    NullContainerEx(){
        super("실습문제 5 이삭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130,50);
        la.setSize(200,20);
        cp.add(la);

        for (int i = 1; i <= 9; i++) {
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15,i*15);
            b.setSize(50,20);
            cp.add(b);
        }
        setSize(300,200);
        setVisible(true);
    }
public static void main(String[] args){
        new NullContainerEx();
}
}

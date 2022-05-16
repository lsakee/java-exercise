package ch8;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {

    public GridLayoutEx(){//18018057이삭
        super("GridLayout예재");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();

        cp.setLayout(new GridLayout(1,10));

        for (int i = 0; i < 10; i++) {
            String text = Integer.toString(i);
            JButton button =new JButton(text);
            cp.add(button);
        }
        setSize(500,200);
        setVisible(true);
    }
    public static void main(String[] args){
        new GridLayoutEx();
    }
}

package ch8;

import javax.swing.*;
import java.awt.*;
//18018057이삭
public class BorderLayoutEx extends JFrame {
    BorderLayoutEx(){
        setTitle("BorderLayout예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();

        cp.setLayout(new BorderLayout(30,20));
        cp.add(new JButton("Calculate"),BorderLayout.CENTER);
        cp.add(new JButton("add"),BorderLayout.NORTH);
        cp.add(new JButton("sub"),BorderLayout.SOUTH);
        cp.add(new JButton("mul"),BorderLayout.EAST);
        cp.add(new JButton("div"),BorderLayout.WEST);
        setSize(300,200);
        setVisible(true);

    }
    public static void main(String[] args){
        new BorderLayoutEx();
    }
}

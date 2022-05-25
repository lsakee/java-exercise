package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaEx extends JFrame {
    JTextField tf = new JTextField(20);
    JTextArea ta = new JTextArea(7,20);
    TextAreaEx(){
        setTitle("이삭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("입력 후 <enter>키 입력하세요"));
        c.add(tf);
        c.add(new JScrollPane(ta));

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText()+"\n");
                tf.setText("");
            }
        });
        setSize(300,250);
        setVisible(true);
    }
    public static void main(String[] args){
        new TextAreaEx();
    }

}

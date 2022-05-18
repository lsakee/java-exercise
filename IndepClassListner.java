package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndepClassListner extends JFrame {

    IndepClassListner(){
        setTitle("Action 이벤트 리스너 이삭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyAction());
        c.add(btn);

        setSize(250,120);
        setVisible(true);
    }
    private class MyAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");
        }
    }
    public static void main(String[] args){
        new IndepClassListner();
    }
}

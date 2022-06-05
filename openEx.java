package ch11;

import ch10.MenuActionEventEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class openEx extends JFrame {
    private JLabel imgLabel = new JLabel();
    JButton[] btn = new JButton[2];
    int n=0;
    JLabel la=new JLabel();
    ImageIcon[] images = new ImageIcon[4];
    Vector<ImageIcon> v = new Vector<ImageIcon>();
    public openEx(){
        setTitle("이삭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        images[0] = new ImageIcon("src/image/image0.jpg");
        images[1] = new ImageIcon("src/image/image1.jpg");
        images[2] = new ImageIcon("src/image/image2.jpg");
        images[3] = new ImageIcon("src/image/image3.jpg");
        la.setIcon(images[n]);
        South sp = new South();
        c.add(la,BorderLayout.CENTER);
        c.add(sp,BorderLayout.SOUTH);
        setSize(250,200);
        setVisible(true);
    }
    class South extends JPanel{
        public South(){
            ImageIcon left = new ImageIcon("src/image/left.png");
            ImageIcon right = new ImageIcon("src/image/right.png");
            setLayout(new FlowLayout());
            btn[0] = new JButton("왼쪽",left);
            btn[1] = new JButton("오른쪽",right);

            btn[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(n>0) {
                        n--;
                        la.setIcon(images[n]);
                    }
                    else if(n<=0){
                        n+=3;
                        la.setIcon(images[n]);
                    }
                }
            });
            btn[1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    n++;
                    n%=4;
                    la.setIcon(images[n]);
                }
            });
            add(btn[0]);
            add(btn[1]);
        }
    }
public static void main(String[] args){
        new openEx();
}
}
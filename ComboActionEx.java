package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {
    private String[] fruits = {"apple","banana","mango"};
    private ImageIcon[] images = { new ImageIcon("src/image/apple.jpg"),
    new ImageIcon("src/image/banana.jpg"),
            new ImageIcon("src/image/mango.jpg")};
    private JLabel imgLabel =new JLabel(images[0]);
    public ComboActionEx() {
        setTitle("[이삭]콤보박스_액션리스너");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("src/image/icon1.png");
        setIconImage(img);
        JComboBox<String> combo = new JComboBox<>(fruits);
        c.add(combo);
        c.add(imgLabel);

        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JComboBox<String> cb = (JComboBox<String>)e.getSource();
                int index= cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }

        });
        setSize(300,250);
        setVisible(true);

    }
    public static void main(String[] args) {
        new ComboActionEx();
    }
}
package ch10;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class RadioButtonEx extends JFrame{
    private JRadioButton[] fruits = new JRadioButton[3];
    private String [] names = {"사과","배","체리"};
    private JLabel la= new JLabel("선택한 아이템 출력");
        public RadioButtonEx() {
            setTitle("이삭");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container c = getContentPane();
            c.setLayout(new FlowLayout());
            ButtonGroup group = new ButtonGroup();
            MyItemListener listener = new MyItemListener();
            for (int i = 0; i < fruits.length; i++) {
                fruits[i] = new JRadioButton(names[i]);
                fruits[i].addItemListener(listener);
                if(i==2)fruits[2].setSelected(true);
                c.add(fruits[i]);
                group.add(fruits[i]);
            }
            c.add(la);
            setVisible(true);
            setSize(250,200);

        }

        public static void main(String[] args) {
            new RadioButtonEx();
        }

        class MyItemListener implements ItemListener {
            private int sum = 0;
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() != ItemEvent.SELECTED) {
                    return;
                }
                JRadioButton button = (JRadioButton) e.getItem();
                la.setText("선택한 아이템 : " + button.getText());
            }
        }
    }
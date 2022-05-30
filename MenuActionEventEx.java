package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionEventEx extends JFrame {

    private JLabel imgLabel = new JLabel();
    public MenuActionEventEx(){
        setTitle("이삭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(250,200);
        setVisible(true);
    }
    private void createMenu(){
        JMenuBar mb =new JMenuBar();
        JMenuItem[] menuItem=new JMenuItem[4];
        String[] itemTitle = {"Load","Hide","ReShow","Exit"};
        JMenu screenMenu = new JMenu("Screen");
        MenuActionListner listner = new MenuActionListner();
        for (int i = 0; i < menuItem.length; i++) {
            menuItem[i]=new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listner);
            screenMenu.add(menuItem[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb);
    }
    class MenuActionListner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String cmd = e.getActionCommand();
            switch (cmd){
                case "Load" :
                    if(imgLabel.getIcon()!=null) return;
                        imgLabel.setIcon(new ImageIcon("src/image/img0.jpg"));
                        break;
                case "Hide" :
                    imgLabel.setVisible(false);
                    break;
                case "ReShow" :
                    imgLabel.setVisible(true);
                    break;
                case "Exit" :
                    System.exit(0);
                    break;
            }
        }

    }



    public static void main(String[] args){
        new MenuActionEventEx();
    }
}

package ch12;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class VibratingSt extends JFrame {
     private MyThread th2=null;
        Thread th;
        public VibratingSt(){
            setTitle("이삭");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(200,200);
            setLocation(300,300);
            setVisible(true);

            getContentPane().addMouseListener(new MyMouse());
    }
    class MyMouse extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            if(th2==null||!th2.isAlive()){
                return;
            }else{
                th2.interrupt();
            }
        }
    }
    class MyThread extends Thread{
        @Override
        public void run() {
            Random r = new Random();
            while (true){
                try{
                    Thread.sleep(20);
                }catch (InterruptedException e){return;}
                int x = getX()+r.nextInt()%5;
                int y = getY()+r.nextInt()%5;
                setLocation(x,y);
            }
        }
    }
    public static void main(String[] args){
            new VibratingSt();
    }
}


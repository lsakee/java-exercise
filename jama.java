package tutorial;

import java.util.Scanner;

public class jama {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("복숭아1,바나나2");
        int input=scanner.nextInt();
        Fruit fruit;
        if(input==1) {
            fruit = new Peach();
            fruit.show();
        }
        else if(input==2) {
            fruit = new Banana();
            fruit.show();
        }
    }
}

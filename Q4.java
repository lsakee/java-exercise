package ch7;

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        System.out.println("2000~2004년 1년 단위 키 입력");
        System.out.print(">> ");
        for(int i = 0; i < 5; i++) {
            v.add(sc.nextInt());
        }
        int max = 0;
        int year = 0;
        for(int i = 0; i < 4; i++) {
            if(max < (v.get(i+1) - v.get(i))){
                max = v.get(i+1) - v.get(i);
                year = i;
            }
        }
        System.out.println("가장 키가 많이 자란 년도는 200" + year+ "년 " + (float)max + "cm");
    }
}//18018057이삭
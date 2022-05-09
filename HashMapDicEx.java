package ch7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {
    public static void main(String[] args){
        HashMap<String,String> dic=new HashMap<String,String>();

        dic.put("baby","아기");
        dic.put("love","사랑");
        dic.put("apple","사과");

        Set<String>keys=dic.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value =dic.get(key);
            System.out.print("(" + key + "," + value + ")");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("찾고 싶은 단어는? 종료 (exit)");
            String eng = scan.next();
            if(eng.equals("exit")){
                System.out.println("단어 찾기 종료");
                break;
            }
            String kor = dic.get(eng);
            if(kor==null) System.out.println(eng+"는 없는 단어입니다");
            else
                System.out.println(kor);
        }
    }
}//18018057이삭

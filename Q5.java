package ch7;

import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> k = new HashMap<String, Integer>();
        System.out.println("나라 이름과 인구를 5개 입력하세요.");
        for(int i = 0; i < 5; i++) {
            System.out.print("나라 이름 인구  ");
            k.put(sc.next(), sc.nextInt());
        }

        Set<String> keys = k.keySet();
        Iterator<String> it = keys.iterator();

        int max = 0;
        String count = null;
        while(it.hasNext()) {
            String key = it.next();
            int value = k.get(key);
            if(max < value) {
                max = value;
                count = key;
            }
        }

        System.out.println("제일 인구가 많은 나라는" + count + " " + k.get(count)  );
    }
}//18018057이삭

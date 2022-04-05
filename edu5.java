package tutorial;

import java.util.Scanner;

public class edu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("커피주문하세요");
        String coffee = scanner.next();
        int all = scanner.nextInt();
        int result = 0;
        switch (coffee){
            case "에스프레소" :
                result += 2000;
                break;
            case "아메리카노" :
                result += 2500;
                break;
            case "카푸치노" :
                result += 3000;
                break;
            case "카페라떼" :
                result += 3500;
                break;
            default : System.out.println("없는메뉴");
        }
        /* if(coffee.equals("에스프레소")){
              result += 2000;
        } else if (coffee.equals("아메리카노")) {
              result=2500;
        }
        else if (coffee.equals("카푸치노")) {
              result += 3000;
        }
        else if(coffee.equals("카페라떼")){
              result+=3500;
        }*/
        System.out.println(result*all+"원입니다.");
    }}//18018057 이삭

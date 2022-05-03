package Ch6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class quest6_2 {
//18018057이삭
        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            while(true) {
                String query = scanner.nextLine();
                if(query.equals("exit")) {
                    System.out.println("종료");
                    break;
                }
                StringTokenizer st = new StringTokenizer(query, " ");
                int n = st.countTokens();
                System.out.println("어절개수" + n);
            }
        }
    }


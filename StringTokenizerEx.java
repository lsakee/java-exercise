package Ch6;

import java.util.StringTokenizer;

public class StringTokenizerEx {//18018057 이삭
    public static void main(String[] args){
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query,"&");

        int n = st.countTokens();
        System.out.println("토큰개수는"+n);

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}



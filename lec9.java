package tutorial;
// 각각 재귀랑 반복 잘이용해야 한다잉
public class lec9 {
    public static int fibonacci(int number){
        if(number==1)
        {
            return 1;
        }
        else if(number==2)
        {
            return 2;
        }
        else
        {
            return fibonacci(number-1)+fibonacci(number-2);
        }

    }
    public static void main(String[] args){
        System.out.println("fiv 10 num"+fibonacci(100));
    }
}


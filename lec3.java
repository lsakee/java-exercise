package tutorial;

public class lec3 {
    final static int SECOND = 1000;
    public static void main(String[] args){
        int a = 50;
        int b= 50;
        double c =Math.pow(3.0,20.0);
        System.out.println("3^20="+ (int) c);
        System.out.println("a=b?"+(a==b));
        System.out.println("a>b?"+(a>b));
        System.out.println("a=b and a>30"+((a==b)&&(a>30)));
        System.out.println("max?"+max(a,b));
    }
    //반환형,함수이름,매개변수
    static int max(int a,int b){
        int result = (a>b)?a:b;
        return result;
    }
}

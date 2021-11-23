package tutorial;

public class lec2 {
    public static void main(String[] args) {
        double a = 10.3;
        double b = 9.6;
        double c = 10.1;
        int f = 200;
        String name = "lee sak";
        System.out.println(name);
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(3,7));
        System.out.println("10진수:"+f);
        System.out.format("8진수:%o\n",f);
        System.out.format("16진수:%x",f);
        System.out.println((a + b + c) / 3);

        for(char i = 'a';i<= 'z';i++){
            System.out.print(i+"");
        }
    }
}
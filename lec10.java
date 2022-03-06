package tutorial;
import java.util.Scanner;
/*public class lec10{
    public static int max(int a,int b){
        return (a > b) ? a : b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("생성할 배열의 크기 입력");
        int number = scanner.nextInt();
        int[]array = new int[number];
        for(int i=0;i<number;i++)
        {
            System.out.print("배열에 입력할 정수 입력");
            array[i]=scanner.nextInt();
        }
        int result=-1;
        for(int i=0;i<number;i++)
        {
            result=max(result,array[i]);
        }
        System.out.println("입력할정수중 가장큰수"+result+"");
    }

}*/
public class lec10{

    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i=0; i<100; i++){
            array[i] = (int)(Math.random()*100+1);
        }
        int sum=0;
        for(int i=0; i<100; i++){
            sum+=array[i];
        }
        System.out.println("100개의 랜덤정수의 평균값"+sum/100+"입니다");
    }
}
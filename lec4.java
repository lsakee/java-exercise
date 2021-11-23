package tutorial;

public class lec4 {
    final static int n=15;
    public static void main(String[] args) {
        for(int i=-n;i<=n; i++)
        {
            for(int j=-n;j<=n;j++)
            {
                if(i*i+j*j<=n*n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
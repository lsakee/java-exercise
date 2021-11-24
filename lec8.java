package tutorial;

public class lec8 {
    public static int factorial(int number){
      if(number == 1){
          return 1;
      }
      else{
          return number*factorial(number-1);
      }
    }

    public static void main(String[] args){
        System.out.println("10 fac"+factorial(10));
    }
}

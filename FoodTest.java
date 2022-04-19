package sd;
abstract class Food{//18018057이삭
    private String name;
    public Food(String name){
        this.name=name;
    }
    public  abstract void cook();
    public  abstract void taste();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Noodle extends Food{
    public Noodle(String name){
        super(name);
    }
    public void cook(){
        System.out.println("요리법 : 끓는 물에 라면과 스프를 넣고 2분간 끓이기");
        }
    public void taste(){
        System.out.println("음식맛 : 개운하고 구수한 맛이난다.");
        }
}

class FriedRice extends Food{
    public FriedRice(String name){
        super(name);
    }
    public void cook(){
        System.out.println("요리법 : 밥과 각종 야채를 기름에 볶는다");
    }
    public void taste(){
        System.out.println("음식맛 : 밥이 고슬고슬하고 잘 볶아진 야채가 잘 어울러진다");
    }
}

public class FoodTest {

    public static void main(String[] args){

        Food[] arr = new Food[2];
        arr[0]=new Noodle("라면");
        arr[1]=new FriedRice("볶음밥");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("음식명"+arr[i].getName());
            arr[i].cook();
            if (arr[i] instanceof Noodle)
                System.out.println("파를 넣는다");
            arr[i].taste();
            System.out.println("***********************");
        }
    }
}

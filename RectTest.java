package sd;
class Shape2{
    private String name; //18018057 이삭
    public void rotate() {
        System.out.println("도형을 회전합니다");
    }
        public Shape2(String name){
            this.name=name;
        }
    }
class Rectangle2 extends Shape2{
    private int width,height;
    public Rectangle2(String name,int width,int height){
        super(name);
        this.width=width;
        this.height=height;
    }
    public void rotate(){
        super.rotate();
        System.out.println("사각형을 회전합니다");
    }
}
public class RectTest {
    public static void main(String[] args){
        Shape2 sp=new Rectangle2("사각형",10,20);
        sp.rotate();
    }
}

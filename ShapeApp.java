package sd;
interface Shape4{ //18018057 이삭
    final double PI=3.14;
    void draw();
    double getArea();
    default public void  redraw(){
        System.out.println("다시그립니다");
        draw();
    }
}
class Circle4 implements Shape4{
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    private int radius;
    public Circle4(int r){
        radius=r;
    }
    public void draw(){
        System.out.print("반지름은"+radius+" ");
    }
    public double getArea(){
        return PI*radius*radius;
    }

}
public class ShapeApp {
    public static void main(String[] args){
        Shape4 coin = new Circle4(10);
        coin.redraw();
        System.out.println("코인으 면적은"+coin.getArea());
    }
}

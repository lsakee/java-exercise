package javaedu;

public class Circle {
    int radius;
    String name;

    public Circle(){
        radius=1;
        name="";
    }
    public Circle(int r,String n){
        radius=r;
        name=n;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args){
        Circle pizza=new Circle(10,"자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"의면적"+area);

        Circle donut=new Circle();
        donut.name="도넛피자";
        area= donut.getArea();
        System.out.println(donut.name+"의면적"+area);

    }
}
// 한태영
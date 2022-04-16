package javaedu;

class Circle5 {
    private int radius;

    public Circle5(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class CircleManager {
    public static void copy(Circle5 src, Circle5 dest) {
        dest.setRadius(src.getRadius());
    }

    public static boolean equals(Circle5 a, Circle5 b) {
        if(a.getRadius() == b.getRadius()) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class StaticTest {//18018057 이삭
    public static void main(String[] args) {
        Circle5 pizza = new Circle5(5);
        Circle5 waffle = new Circle5(1);

        boolean res = CircleManager.equals(pizza, waffle);
        if(res == true) {
            System.out.println("pizze와 waffle 크기 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기 다름");
        }

        CircleManager.copy(pizza, waffle);
        res = CircleManager.equals(pizza, waffle);

        if(res == true) {
            System.out.println("pizze와 waffle 크기 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기 다름");
        }
    }
}

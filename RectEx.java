package Ch6;
class Rect{
    int w,h;
    public Rect(int w, int h){
        this.w=w;
        this.h=h;
    }
    public boolean equals(Object obj){
        Rect p=(Rect)obj;
        if(w*h==p.w*p.h)
            return true;
        else
            return false;
    }
        }
public class RectEx { //18018057 이삭
    public static void main(String[] args){
        Rect a= new Rect(2,3);
        Rect b= new Rect(3,2);
        Rect c= new Rect(3,4);
        if(a.equals(b))
            System.out.println("a is equals to b");

        if(a.equals(c))
            System.out.println("a is equals to b");

        if(b.equals(c))
            System.out.println("a is equals to b");
    }
}

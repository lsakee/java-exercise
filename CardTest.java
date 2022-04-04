package javaedu;
class Card{
    private String kind;
    private int num;
    public static int width=100,height=250;
    public void showInfo(){
        System.out.print("무늬"+kind+",숫자:"+num);
    }
    public void showSize(){
        System.out.println("카드size"+width+"X"+height);
    }
    public static void setSize(int w,int h){
        width=w;
        height=h;
    }

    public Card(){
        kind="Spade";
        num=1;
    }

    public Card(String kind ,int num){
    this.kind=kind;
    this.num=num;
    }

    public String getKind() {
        return kind;
    }

    public int getNum() {
        return num;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class CardTest {

    public static void main(String[] args){

        System.out.println("카드폭은" + Card.width +",높이는" + Card.height);
        Card c1 = new Card("Heart",7);
        Card c2 = new Card("Spade",4);
        System.out.print("C1 은 ");
        c1.showInfo();
        c1.showSize();
        System.out.print("C2 은 ");
        c2.showInfo();
        c2.showSize();
        System.out.println("카드 사이즈 변경!!");
        Card.setSize(50,80);
        System.out.print("C1 은 ");
        c1.showInfo();
        c1.showSize();
        System.out.print("C2 은 ");
        c2.showInfo();
        c2.showSize();
    }
//18018057 이삭
}

package Ch6;

public class quset6_3 {
    //18018057 이삭
    public static void main(String [] args) {
        int r[] = new int[3];
        for(;;){
            for(int i = 0; i < r.length; i++) {
                r[i]=(int)(Math.random()*3);
                r[i]+=1;
                System.out.print(r[i] + "\t");
            }
            System.out.println();
            if(r[0] == r[1] && r[1] == r[2]) {
                System.out.println("성공");
                break;
            }
        }
    }
}

package sd;

import java.util.Arrays;
import java.util.Scanner;
abstract class F1ood{
    private String fd;
    public F1ood(String fd){
        this.fd=fd;
    }
    public abstract void coo1k();
    public abstract void tast1e();
}
class n1oodle extends F1ood{
    public n1oodle(String fd){
        super(fd);
    }

    @Override
    public void coo1k() {

    }

    @Override
    public void tast1e() {

    }
}
public class test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


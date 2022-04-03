package javaedu;
import java.util.Scanner;

class Boiler {
    private double temp;

    public Boiler(double temp) {
        this.temp = temp;
    }

    public Boiler() {
        this.temp = 0;
    }

    public double tempUp() {
        this.temp += 1;
        return temp;
    }

    public double tempDown() {
        this.temp -= 1;
        return temp;
    }

    //18018057 이삭
    public double tempUpDown(double value) {
        this.temp += value;
        return temp;
    }

        public static void main(String[] args) {
            Boiler Boil1 = new Boiler(39.5);
            Boiler Boil2 = new Boiler();
            System.out.println(Boil1.tempUp());
            System.out.println(Boil2.tempUpDown(40));
        }
    }

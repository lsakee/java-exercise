package javaedu;

import java.util.Scanner;

    class Rect{ // 18018057 이삭
        private int width, height;

        public Rect(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getArea() {
            return width*height;
        }
    }

    public class num3{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Rect[] Array = new Rect[4];
            int sum = 0;

            for(int i = 0; i < 4; i++) {
                System.out.print((i+1) + " 너비와 높이 ");
                Array[i] = new Rect(scanner.nextInt(), scanner.nextInt());
                sum += Array[i].getArea();
            }
            System.out.println("저장");
            System.out.println("사각형 합 " + sum);
        }
    }


package javaedu;

public class CircleArray {
    public static void main(String[] args){
        Circle [] arr = new Circle[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Circle(i,i+"반지름원");
        }
        System.out.println("원의 넓이 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name+"의넓이"+arr[i].getArea());
        }
    }
}

//한태영
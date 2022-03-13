package tutorial;
import java.awt.*;
import java.util.Scanner;
public class 상속 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("총몇명의 학생??");
        int num=scan.nextInt();
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;
            System.out.print("학생의 이름");
            name = scan.next();
            System.out.print("학생의 나이");
            age = scan.nextInt();
            System.out.print("학생의 키");
            height = scan.nextInt();
            System.out.print("학생의 무게");
            weight = scan.nextInt();
            System.out.print("학생의 번호");
            studentID = scan.next();
            System.out.print("학생의 학냔");
            grade = scan.nextInt();
            System.out.print("학생의 학점");
            GPA = scan.nextDouble();
            students[i]=new Student(name,age,height,weight,studentID,grade,GPA);
        }
        for (int i = 0; i < num; i++) {
            students[i].show();
        }
    }
}

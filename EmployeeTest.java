package javaedu;

import java.util.Scanner;

class Employee{
    private String name;
    private String tel;
    private int salary;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee() {
        name="본인이름"; tel="010"; salary=3000;
    }
    public Employee(String name, String tel, int salary) {
        this.name=name; this.tel=tel; this.salary=salary;
    }
    public void show() {
        System.out.println("이름:"+name);
        System.out.println("전화번호:"+tel);
        System.out.println("연봉:"+salary);
    }
}


public class EmployeeTest {
    public static double Avg(Employee[] arr) {
        double sum =0, avg;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i].getSalary();

        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee[] arr = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            System.out.print(i+"번째 이름, 전화번호, 연봉을 순서대로 입력>>");
            arr[i] = new Employee(sc.next(), sc.next(),sc.nextInt());
        }
        System.out.println("연봉의 평균:"+Avg(arr));
    }

}
//18018057이삭
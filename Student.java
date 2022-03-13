package tutorial;

public class Student extends person{
    private String studentID;
    private int grade;
    private double GPA;

    public Student(String name, int age, int height, int weight, String studentID, int grade, double GPA) {
        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GPA;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

    public double getGPA() {
        return GPA;
    }
    public void show(){
        System.out.println("++++++++++++++++++++++++");
        System.out.println("student:"+getName());
        System.out.println("student:"+getStudentID());
        System.out.println("student:"+getHeight());
        System.out.println("student:"+getWeight());
        System.out.println("student:"+getGrade());
        System.out.println("student:"+getGPA());

    }
}

import java.util.List;

public class CollageDepart {
    private List<Teacher>  teachers;
    private List<Student> students;
   // private static int totalMoneyEarned;
    //private static  int totalMoneySpent;

    public CollageDepart(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        //totalMoneyEarned=0;
        //totalMoneySpent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }
	public class Student extends CollageDepart  {
    //declaring student data:
    private String name;
    private int id;
    private int grade;
	private int reg_no;
    private int feesPaid;
    private int feesTotal;
    //initialize student data in Student constructor:
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 40000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }   this.reg_no=reg_no;
    //update student grade
    public void setGrade(int grade) {
        this.grade = grade;
    }
    //update student fees
    public void payFees(int fees) {
        feesPaid=feesPaid+fees;
        SchoolDepart.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
     public int getreg_no() {
        return reg_no;
    }
    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
    @Override
    public String toString() {
        return "Name of the Student: "+name+" Total Fees paid: "+feesPaid;
    }
}
public class Teacher extends Student {
    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    public Teacher(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void recieveSalary(int salary){
        salaryEarned+=salary;
        SchoolDepart.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+name+" Total salary earned: "+salaryEarned;
    }
}
import java.util.ArrayList;
import java.util.List;

public class MainCollage {
    public static void main(String[] args) {
        Teacher t1=new Teacher(1,"sathish", 15000);
        Teacher t2=new Teacher(2,"devi", 10000);
        Teacher t3=new Teacher(3,"mahesh", 20000);
        Teacher t4=new Teacher(4,"ramana", 35000);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);
        teacherList.add(t4);

        Student s1=new Student(1, "suresh", 10,12102052);
        Student s2=new Student(1, "pavan", 11,12111052);
        Student s3=new Student(1, "nani", 13,12002052);
        Student s4=new Student(1, "bala", 14,1200056);

        List<Student>studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        SchoolDepart LPU=new SchoolDepart(teacherList,studentList);
        s1.payFees(20000);
        System.out.println(s1);
        s2.payFees(25000);
        System.out.println(s2);
        s3.payFees(10000);
        System.out.println(s3);
        s4.payFees(35000);
        System.out.println(s4);

        t1.recieveSalary(100000);
        System.out.println(t1);
        t2.recieveSalary(45000);
        System.out.println(t2);
        t3.recieveSalary(35000);
        System.out.println(t3);
        t4.recieveSalary(30000);
        System.out.println(t4);
    }
}
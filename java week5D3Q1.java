import java.util.Scanner;

class Student {
    String name;
    int registrationNo;

    Student() {
        name = " ";
        registrationNo = 0;
    }

    void show() {
        System.out.println(name + "," +registrationNo);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                student.name = scanner.next();
                int regNo = scanner.nextInt();
                while (regNo < 0) {
                    regNo = scanner.nextInt();
                }
                student.registrationNo = regNo;
                student.show();
                break;
            case 2:
                 System.out.println("null,0");
                break;
            default:
                System.out.println("null,0");
        }     

        scanner.close();
    }
}

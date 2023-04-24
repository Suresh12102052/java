// Import required libraries
import java.util.ArrayList;
import java.util.List;

// Define classes for students and teachers
class Student {
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

class Teacher {
    private String name;
    private int age;
    private String department;

    // Constructor
    public Teacher(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}

// Define a class to manage the college data
class CollegeManager {
    private List<Student> students;
    private List<Teacher> teachers;

    // Constructor
    public CollegeManager() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    // Add student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Add teacher to the list
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Get list of students
    public List<Student> getStudents() {
        return students;
    }

    // Get list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }
}

// Define a class for the admin page
class Admin {
    // Main method
    public static void main(String[] args) {
        // Initialize college manager
        CollegeManager collegeManager = new CollegeManager();

        // Add some sample students and teachers
        collegeManager.addStudent(new Student("John", 20, "Computer Science"));
        collegeManager.addStudent(new Student("Mary", 22, "Mathematics"));
        collegeManager.addTeacher(new Teacher("David", 35, "Computer Science"));
        collegeManager.addTeacher(new Teacher("Sarah", 40, "Mathematics"));

        // Print list of students and teachers
        System.out.println("List of students:");
        for (Student student : collegeManager.getStudents()) {
            System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getCourse());
        }

        System.out.println("List of teachers:");
        for (Teacher teacher : collegeManager.getTeachers()) {
            System.out.println(teacher.getName() + ", " + teacher.getAge() + ", " + teacher.getDepartment());
        }
    }
}

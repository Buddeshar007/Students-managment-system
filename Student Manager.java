import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }
    
    public void deleteStudent(int id) {
        students.removeIf(s -> s.id == id);
        System.out.println("Student Deleted if existed!");
    }
}

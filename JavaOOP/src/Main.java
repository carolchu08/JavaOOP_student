import model.Student;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", "M",18,1234);
        System.out.println("Student name:" + student.getName());
        System.out.println("Gender:" + student.getGender());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student id number: " + student.getStudentIDNumber());
    }
}

package labs_examples.packages.labs.main;

import labs_examples.packages.labs.package1.Teacher;
import labs_examples.packages.labs.package2.Student;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();

        Teacher.name = "Mrs. Smith";
        Student.name = "John";

        teacher.isTeacherOfAge(35);
        student.isStudentOfAge(16);

        teacher.age = 35;
        student.age = 16;

        teacher.teacherId = "T001";
        student.studentId = "S001";
    }
}

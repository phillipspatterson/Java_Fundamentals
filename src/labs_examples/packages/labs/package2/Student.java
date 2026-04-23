package labs_examples.packages.labs.package2;

public class Student {
    public static String name;
    public int age;
    public String studentId;

    public void isStudentOfAge(int age){
        this.age = age;
        if (age > 18){
            System.out.println("not a student");
        }
    }

    public void accurateStudentId(String studentId){
        System.out.println("Student Id is:" + studentId);
    }
}

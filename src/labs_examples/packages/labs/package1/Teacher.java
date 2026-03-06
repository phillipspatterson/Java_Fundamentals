package labs_examples.packages.labs.package1;

public class Teacher {
    public static String name;
    protected int age;
    private String teacherId;

    public void isTeacherOfAge(int age){
        this.age = age;
        if (age < 21){
            System.out.println("not a teacher");
        }
    }

    public void accurateTeacherId(String teacherId){
        System.out.println("Student Id is:" + teacherId);
    }
}

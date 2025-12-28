package labs_examples.conditions_loops.labs;

public class Demo {
    // class demo scope
    static int i = 7;

    public static void main(String[] args) {
        // main method scope
        i = 10;
        int n = i + 20;
        if (i < 20) {
            // if statement scope

            System.out.println("i = " + i);
            System.out.println("n = " + n);
        }
        System.out.println("i = " + i);
        System.out.println("n = " + n);

        demoMethod();
        System.out.println("done");
    }

    public static void demoMethod() {

        System.out.println("demo method one");
        demoMethodTwo();
        int n = i + 20;
        System.out.println(n);
        // demoMethod(i);
        System.out.println("test");
    }

    public static void demoMethodTwo() {
        System.out.println("demo Method Two");
    }
}

package labs_examples.static_nonstatic.labs;

public class NBATeamsController {
    public static void main(String[] args) {
        //1) A static method calling another static method in the same class
        staticMethod();
        //2) A static method calling a non-static method in the same class
        NBATeamsController nba = new NBATeamsController();
        nba.nonStaticMethod();
        //3) A static method calling a static method in another class
        NBATeams.calculateWinPercentage();
        //4) A static method calling a non-static method in another class
        NBATeams nba2 = new NBATeams();
        nba2.whoIsTheWealthiestFranchsie();



    }

    public static void staticMethod(){
        System.out.println("NBA Controller static method");
    }

    public void nonStaticMethod() {
        System.out.println("NBA Controller non static methods");

        //5) A non-static method calling a non-static method in the same class
        nonStaticMethod2();
        //6) A non-static method calling a non-static method in another class
        NBATeams nba3 = new NBATeams();
        nba3.whoIsTheWealthiestFranchsie();
    }

    public void nonStaticMethod2(){
        System.out.println("NBA Controller non static method 2");
        //7) A non-static method calling a static method in the same class
        staticMethod();
        //8) A non-static method calling a static method in another class
        NBATeams.calculateWinPercentage();
    }
}

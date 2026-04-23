package labs_examples.exception_handling.labs;

public class MyExcpetion extends Exception{
    String message;
    public MyExcpetion(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}

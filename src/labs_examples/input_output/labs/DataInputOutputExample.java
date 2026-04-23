package labs_examples.input_output.labs;

import java.io.*;

public class DataInputOutputExample {
    public static void main(String[] args) {

        DataOutputStream output = null;
        DataInputStream input =  null;

        try {
            output = new DataOutputStream(new FileOutputStream("example.txt"));
            output.writeInt(50);
            output.writeDouble(3.14);
            output.writeBoolean(true);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                output.close();
            }catch (Exception e) {
                System.out.println("Trouble closing output");
            }
        }

        try {
            input = new DataInputStream(new FileInputStream("example.txt"));
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readBoolean());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                input.close();
            }catch (Exception e) {
                System.out.println("Trouble closing input");
            }
        }
    }
}

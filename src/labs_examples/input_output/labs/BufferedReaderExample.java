package labs_examples.input_output.labs;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {

        int character;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\ppatterson\\IdeaProjects\\Java_Fundamentals\\src\\labs_examples\\input_output\\files\\char_data.txt"));
            writer = new BufferedWriter(new FileWriter("encrypted.txt"));
            while ((character = reader.read()) != -1){
                if (character == 'a'){
                    writer.write('-');
                } else if (character == 'e'){
                    writer.write('~');
                } else {
                    writer.write(character);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (Exception e){
                System.out.println("Error closing reader or writer");
            }
        }
    }
}


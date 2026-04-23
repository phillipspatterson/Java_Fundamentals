package labs_examples.input_output.labs;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            inputStream =
                    new FileInputStream("C:\\Users\\ppatterson\\IdeaProjects\\Java_Fundamentals\\src\\labs_examples\\input_output\\files\\byte_data");
            bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, bytesRead));
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
class CSVParser{
    public static void main(String[] args) {
        //read file
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader("/Users/phillippatterson/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/NBA_Player_Stats.csv"));
            ArrayList<Object> arrayList = new ArrayList<Object>();
            while ((line = reader.readLine()) != null) {
                String[] stats = line.split(",");
                System.out.println(line);
                NBAPlayerStats nbaPlayer = new NBAPlayerStats();
                nbaPlayer.name = stats[0];
                nbaPlayer.points = Double.parseDouble(stats[1]);
                nbaPlayer.rebounds = Integer.parseInt(stats[2]);
                nbaPlayer.assists = Integer.parseInt(stats[3]);

                arrayList.add(nbaPlayer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("Error closing csv");
            }
        }
    }
}

class NBAPlayerStats{
    //create variables that match csv fields
    String name;
    double points;
    int rebounds;
    int assists;

}
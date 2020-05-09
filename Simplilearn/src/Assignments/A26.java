package Assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class A26 {
    public static void main(String[] args) throws IOException {
        String pathToCsv="/Users/jak/Simply/workspace/src/Assignments/new.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        //String row;
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            // do something with the data
        }
        csvReader.close();
    }
}

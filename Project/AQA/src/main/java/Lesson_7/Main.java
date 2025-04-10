package Lesson_7;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String filePath = "data.csv";

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        AppData appData = new AppData(header, data);


        try {
            CSVSaver.save(appData, filePath);
            System.out.println("Data saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving " + e.getMessage());
        }

        try {
            AppData loadedData = CSVLoader.load(filePath);
            System.out.println("Data loaded from " + filePath);
            System.out.println("Header: " + Arrays.toString(loadedData.getHeader()));
            System.out.println("Data: " + Arrays.deepToString(loadedData.getData()));

        } catch (IOException e) {
            System.out.println("Error loading " + e.getMessage());
        }
    }
}

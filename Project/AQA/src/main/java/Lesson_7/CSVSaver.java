package Lesson_7;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVSaver {
    public static void save(AppData data, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Write header
            bw.write(String.join(";", data.getHeader()));
            bw.newLine();

            // Write data
            for (int[] row : data.getData()) {
                StringBuilder line = new StringBuilder();
                for (int i = 0; i < row.length; i++) {
                    line.append(row[i]);
                    if (i < row.length - 1) {
                        line.append(";");
                    }
                }
                bw.write(line.toString());
                bw.newLine();
            }
        }
    }
}
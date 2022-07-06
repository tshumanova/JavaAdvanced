package Java_Advanced.Iterators.T4_StreamsFilesAndDirectories;

import java.io.*;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String programDir = System.getProperty("user.dir");

        String path = programDir + "\\input.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));

        BufferedWriter writer = new BufferedWriter(new FileWriter("every-third-line-out.txt"));
        int counter = 0;

        String line = reader.readLine();
        while ((line != null)) {
            counter++;
            if (counter % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
            line = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}

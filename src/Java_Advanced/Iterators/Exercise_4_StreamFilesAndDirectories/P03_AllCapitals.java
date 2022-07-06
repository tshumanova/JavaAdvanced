package Java_Advanced.Iterators.Exercise_4_StreamFilesAndDirectories;

import java.io.*;

public class P03_AllCapitals {
    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader("src/Java_Advanced.Iterators.Resources_4_Exercise/input.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("src/Java_Advanced.Iterators.Resources_4_Exercise/output.txt"))) {
            br.lines().forEach(line -> pw.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

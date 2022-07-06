package Java_Advanced.Iterators.Exercise_4_StreamFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P05_LineNumbers {
    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter("src/Java_Advanced.Iterators.Resources_4_Exercise/output.txt")) {
            Path inputFile = Paths.get("src/Java_Advanced.Iterators.Resources_4_Exercise/inputLineNumbers.txt");
            List<String> lines = Files.readAllLines(inputFile);
            for (
                    int i = 0; i < lines.size(); i++) {
                pw.println((i + 1) + ". " + lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package Exercise_4_StreamFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P07_MergeToFiles {
    public static void main(String[] args) throws IOException {

        Path input1 = Paths.get("src/Resources_4_Exercise/inputOne.txt");
        Path input2 = Paths.get("src/Resources_4_Exercise/inputTwo.txt");
        Path output = Paths.get("src/Resources_4_Exercise/output.txt");

            try {
                List<String> firstFile = Files.readAllLines(input1);
                List<String> secondFile = Files.readAllLines(input2);
                Files.write(output, firstFile, StandardOpenOption.APPEND);
                Files.write(output, secondFile, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

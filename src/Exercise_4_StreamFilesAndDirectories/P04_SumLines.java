package Exercise_4_StreamFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P04_SumLines {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Resources_4_Exercise/input.txt"))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                long sum = 0;
                char[] characterFromLine = line.toCharArray();
                for (char singleCharacter : characterFromLine) {
                    sum += singleCharacter;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


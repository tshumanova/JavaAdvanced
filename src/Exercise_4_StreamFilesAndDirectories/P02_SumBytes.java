package Exercise_4_StreamFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02_SumBytes {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Resources_4_Exercise/input.txt"))) {

            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null) {

                char[] characterFromLine = line.toCharArray();
                for (char singleCharacter : characterFromLine) {
                    sum += singleCharacter;
                }

                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



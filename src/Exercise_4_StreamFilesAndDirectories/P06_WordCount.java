package Exercise_4_StreamFilesAndDirectories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06_WordCount {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(new FileReader("src/Resources_4_Exercise/words.txt"));
             Scanner textScanner = new Scanner(new FileReader("src/Resources_4_Exercise/text.txt"));
             PrintWriter printWriter = new PrintWriter("src/Resources_4_Exercise/results.txt")) {
            LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" ")).forEach((word -> wordMap.put(word, 0)));
            // String[] words= scan.nextLine().split(" ");
            while (textScanner.hasNext()) {
                String textInput = textScanner.next();
                if (wordMap.containsKey(textInput)) {
                    int occurrences = wordMap.get(textInput);
                    occurrences++;
                    wordMap.put(textInput, occurrences);
                }
            }
            wordMap.entrySet().forEach(entry -> printWriter.printf("%s - %d%n", entry.getKey(), entry.getValue()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

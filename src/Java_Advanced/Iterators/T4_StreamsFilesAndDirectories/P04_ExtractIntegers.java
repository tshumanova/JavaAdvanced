package Java_Advanced.Iterators.T4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String programDir = System.getProperty("user.dir");

        String path = programDir + "\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);


        Scanner scanner = new Scanner(fileInputStream);

        PrintWriter writer = new PrintWriter(new FileOutputStream("integers-out.txt"));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {

                writer.println(scanner.next());
            } else {
                scanner.next();
            }
        }
        writer.close();
    }
}

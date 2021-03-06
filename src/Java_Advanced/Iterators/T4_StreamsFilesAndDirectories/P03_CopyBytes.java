package Java_Advanced.Iterators.T4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class P03_CopyBytes {
    public static void main(String[] args) {

        String programDir = System.getProperty("user.dir");

        String path = programDir + "\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            int read = inputStream.read();

            PrintWriter writer=new PrintWriter(outputStream);

            while (read != -1) {
              if(read==' '){
                  writer.print(' ');
              }else if(read==10) {
                    writer.println();
                }else{
                  writer.print(read);
              }

                read = inputStream.read();
            }
            writer.close();
        } catch (IOException ignored) {
        }
    }
}

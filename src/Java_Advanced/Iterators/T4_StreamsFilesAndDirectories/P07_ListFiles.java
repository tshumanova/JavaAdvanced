package Java_Advanced.Iterators.T4_StreamsFilesAndDirectories;

import java.io.File;

public class P07_ListFiles {
    public static void main(String[] args) {
        String programDir = System.getProperty("user.dir");

        String path = programDir + "\\input.txt";

        File file = new File("C:\\Users\\tedi1\\Desktop\\Java Advanced - май 2022\\8.Stream-Files and Directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources.zip\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if(file.exists()){
            File[] files = file.listFiles();
            for (File f : files != null ? files : new File[0]) {
                if(!f.isDirectory()){
                    System.out.println(f.getName() + ": [" + f.length() + "]");
                }
            }
        }
    }
}

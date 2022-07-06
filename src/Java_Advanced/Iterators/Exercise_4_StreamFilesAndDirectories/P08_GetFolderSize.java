package Java_Advanced.Iterators.Exercise_4_StreamFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class P08_GetFolderSize {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\tedi1\\Desktop\\JAVA ADVANCED\\src\\Java_Advanced.Iterators.Exercise_4_StreamFilesAndDirectories");
        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(folder);

        int sumBytes = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File f : Objects.requireNonNull(nestedFiles)) {
                if (f.isDirectory()) {
                    dirs.offer(f);
                }
                else {
                    sumBytes += f.length();
                }
            }
        }
        System.out.println("Folder size: " + sumBytes);
    }
}

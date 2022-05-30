package T4_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class P06_SortLines {
    public static void main(String[] args) throws IOException {
        String programDir = System.getProperty("user.dir");

        String path = programDir + "\\input.txt";

        List<String> sortedLines = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Path outputPath = Path.of("sorted-lines-out.txt");

        Path write = Files.write(outputPath, sortedLines);
    }
}

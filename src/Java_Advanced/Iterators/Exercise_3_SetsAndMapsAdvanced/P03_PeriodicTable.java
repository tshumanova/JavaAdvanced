package Java_Advanced.Iterators.Exercise_3_SetsAndMapsAdvanced;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompound = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < numberOfCompound; i++) {
            String[] elementsInput = scanner.nextLine().split(" ");
            Collections.addAll(elements, elementsInput);
        }
        String result = String.join(" ", elements);
        System.out.println(result);
    }
}

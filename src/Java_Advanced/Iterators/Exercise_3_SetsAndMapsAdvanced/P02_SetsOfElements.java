package Java_Advanced.Iterators.Exercise_3_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] setSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstSetSize = setSize[0];
        LinkedHashSet<String> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(scanner.nextLine());
        }

        int secondSetSize = setSize[1];
        LinkedHashSet<String> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(scanner.nextLine());
        }
        for (String element : firstSet) {
            if (secondSet.contains(element)) {
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }
}

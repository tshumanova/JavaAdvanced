package T3_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P03_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 0;
        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            rounds++;
            if (rounds == 50) {
                break;
            }
            int firstCard=firstDeck.iterator().next();
            firstDeck.iterator().remove();

            int secondCard=firstDeck.iterator().next();
            firstDeck.iterator().remove();
        }
    }
}

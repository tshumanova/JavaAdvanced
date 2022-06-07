package Exercise_5_FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Comparator<Integer> sortArray = (x, y) -> (isEven(x) && !isEven(y)) ? -1 : (!isEven(x) && isEven(y)) ? 1 : x.compareTo(y);
        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(sortArray)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }
}

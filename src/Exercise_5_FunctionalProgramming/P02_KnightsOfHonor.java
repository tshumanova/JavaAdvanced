package Exercise_5_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Consumer<String> printer = name -> System.out.println("Sir " + name);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(printer);
    }
}

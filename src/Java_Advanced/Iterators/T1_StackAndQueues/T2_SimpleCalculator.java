package Java_Advanced.Iterators.T1_StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class T2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> calculator = new ArrayDeque<>();
        Collections.addAll(calculator, input);
        while (calculator.size() > 1) {
            sum(calculator.pop(), calculator.pop(), calculator.pop(), calculator);
        }
        System.out.println(calculator.peek());

    }
    private static void sum(String pop, String pop1, String pop2, ArrayDeque<String> calculation) {
        if ("+".equals(pop1)) calculation.push(String.valueOf(Integer.parseInt(pop) + Integer.parseInt(pop2)));
        else calculation.push(String.valueOf(Integer.parseInt(pop) - Integer.parseInt(pop2)));

    }
}

package Java_Advanced.Iterators.Exam_25_6;

import java.util.*;
import java.util.stream.Collectors;

public class P01_ChocolateTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Double> queueMilk = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        Deque<Double> stackCacaos = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).forEach(e -> stackCacaos.push(e));

        Double[] array = new Double[6];
        while (!queueMilk.isEmpty() && !stackCacaos.isEmpty()) {

            double currentMilk = queueMilk.poll();
            double currentCacao = stackCacaos.pop();
            double sum = currentCacao / (currentMilk + currentCacao) * 100;
            if (sum == 30 || sum == 50 || sum == 100) {
                if (sum == 30) {
                    array[0] += 1;
                } else if (sum == 50) {
                    array[1] += 1;
                } else if (sum == 100) {
                    array[2] += 1;
                }
            } else {
                stackCacaos.push(currentCacao + 3);
            }
        }
        boolean isReady = true;
        for (double e : array) {
            if (e == 0) {
                isReady = false;
            }
        }
        if (isReady) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        // # {chocolate type} --> {amount}
        if (queueMilk.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.println("Liquids left: " + queueMilk.stream().map(obj -> String.valueOf(obj))
                    .collect(Collectors.joining(", ")));
        }
        if (stackCacaos.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.println("Ingredients left: " + stackCacaos.stream().map(obj -> String.valueOf(obj))
                    .collect(Collectors.joining(", ")));
        }
        System.out.println("Milk Chocolate: " + array[0]);
        System.out.println("Dark Chocolate" + array[1]);
        System.out.println("Baking Chocolate" + array[2]);

    }
}
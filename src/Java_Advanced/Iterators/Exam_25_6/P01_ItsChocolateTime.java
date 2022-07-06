package Java_Advanced.Iterators.Exam_25_6;

import java.util.*;
import java.util.stream.Collectors;

public class P01_ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> liquidsMilk = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Double> ingredientsCacao = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(ingredientsCacao::push);

        Map<String, Double> cookedChocolate = new TreeMap<>();

        cookedChocolate.put("Milk Chocolate", 0.0);
        cookedChocolate.put("Dark Chocolate", 0.0);
        cookedChocolate.put("Baking Chocolate", 0.0);


        while (!liquidsMilk.isEmpty() && !ingredientsCacao.isEmpty()) {
           double lastCacao = ingredientsCacao.pop();
            double sum =lastCacao/(liquidsMilk.poll() + lastCacao);


            String chocolate;
            if (sum == 30.0) {
                chocolate = "Milk Chocolate";
            } else if (sum == 50.0) {
                chocolate = "Dark Chocolate";
            } else if (sum == 100.0) {
                chocolate = "Baking Chocolate";

            }

            if (cookedChocolate != null) {
                double newVal = cookedChocolate.get(cookedChocolate);
                cookedChocolate.put(String.valueOf(cookedChocolate), newVal);
            } else {
                ingredientsCacao.push(lastCacao + 3);
            }
        }
        boolean allFoodsAreCooked = cookedChocolate.entrySet().stream().allMatch(e -> e.getValue() > 0);

        if (allFoodsAreCooked) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        String remainingLiquids = liquidsMilk.isEmpty() ? "none" : liquidsMilk.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("\" # {chocolate type} --> " + remainingLiquids);


        String remainingIngredients = ingredientsCacao.isEmpty() ? "none" : ingredientsCacao.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Ingredients left: " + remainingIngredients);

        cookedChocolate.entrySet()
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

    }
}

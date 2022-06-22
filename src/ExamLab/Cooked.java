package ExamLab;

import java.util.*;
import java.util.stream.Collectors;

public class Cooked {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<String, Integer> cookedFoods = new TreeMap<>();

        cookedFoods.put("Bread",0);
        cookedFoods.put("Cake",0);
        cookedFoods.put("Pastry",0);
        cookedFoods.put("Fruit Pie",0);


        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int lastIngredients = ingredients.pop();
            int sum = liquids.poll() + lastIngredients;

            String cookedFood;
            switch (sum) {
                case 25:
                    cookedFood = "Bread";
                    break;
                case 50:
                    cookedFood = "Cake";
                    break;
                case 75:
                    cookedFood = "Pastry";
                    break;
                case 100:
                    cookedFood = "Fruit Pie";
                    break;
            }

            if (cookedFood != null) {
                cookedFoods.putIfAbsent(cookedFood, 0);
                int newVal = cookedFoods.get(cookedFood) + 1;
                cookedFoods.putIfAbsent(cookedFood, newVal);
            }
        }
    }
}

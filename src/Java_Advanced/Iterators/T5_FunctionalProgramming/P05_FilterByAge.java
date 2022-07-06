package Java_Advanced.Iterators.T5_FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class P05_FilterByAge {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberLine = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> peopleWhitAge = new LinkedHashMap<>();
        for (int i = 0; i < numberLine; i++) {
            String[] personData = scanner.nextLine().split(",\\s+");
            peopleWhitAge.put(personData[0], Integer.parseInt(personData[1]));
        }
        String condition = scanner.nextLine(); //"younger" or "older"
        Integer age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine(); //"name", "age" or "name age"

        BiPredicate<Integer, Integer> filterByAge;
        if ("younger".equals(condition)) {
            filterByAge = (personAge, ageLimit) -> personAge <= ageLimit;
        } else {
            filterByAge = (personAge, ageLimit) -> personAge >= ageLimit;
        }

        Consumer<Map.Entry<String, Integer>> printPersonData;

        switch (format) {
            case "name":
                printPersonData = person -> System.out.println(person.getKey());
                break;
            case "age":
                printPersonData = person -> System.out.println(person.getValue());
                break;
            case "name age":
                printPersonData = person -> System.out.println(person.getKey() + " - " + person.getValue());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + format);
        }
        peopleWhitAge.entrySet()
                .stream()
//
                .filter(person -> filterByAge.test(person.getValue(), age))
                .forEach(printPersonData);

    }
}

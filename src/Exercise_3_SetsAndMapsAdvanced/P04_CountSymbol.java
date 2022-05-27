package Exercise_3_SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_CountSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        TreeMap<Character, Integer> symbolMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!symbolMap.containsKey(currentChar)) {
                symbolMap.put(currentChar, 1);
            } else {
                int currentCharCount = symbolMap.get(currentChar);
                symbolMap.put(currentChar, ++currentCharCount);
            }
        }
        for (var pair : symbolMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());

        }
    }
}

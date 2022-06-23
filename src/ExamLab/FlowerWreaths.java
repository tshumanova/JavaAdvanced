package ExamLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liliesInput = scanner.nextLine().split(", ");
        String[] rosesInput = scanner.nextLine().split(", ");


        List<Integer> lilies = Arrays.stream(liliesInput)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> roses = Arrays.stream(rosesInput)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        for (Integer lily : lilies) {
            liliesStack.push(lily);
        }
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>(roses);
        for (Integer rose : roses) {
            rosesQueue.offer(rose);
        }
        int wreath = 0;
        int otherFlowers = 0;
        while (!liliesStack.isEmpty() && rosesQueue.isEmpty()) {
            int lily = liliesStack.pop();
            int rose = rosesQueue.poll();

            int sum = lily + rose;

            while (sum > 15) {
                lily -= 2;
                sum = lily + rose;
            }

            if (sum == 15) {
                wreath++;
            } else if (sum < 15) {
                otherFlowers += sum;
            }
        }
    }
}


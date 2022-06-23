package ExamLab;

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


    }
}

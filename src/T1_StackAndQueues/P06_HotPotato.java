package T1_StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids, input);
        int number = Integer.parseInt(scanner.nextLine());
    }
}

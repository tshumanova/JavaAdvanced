package Exercise_1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countToPush = input[0];
        int countToPop = input[1];;
        int countToSearch = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for(int i=0;i<countToPush;i++){
            stack.push(numbers[i]);

        }
    }
}

package Java_Advanced.Iterators.T1_StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> toBinary = new ArrayDeque<>();

        while (number != 0) {
            toBinary.push(number % 2);
            number /= 2;
        }
        if (toBinary.size() == 0) {
            System.out.print(0);
        } else {
            toBinary.forEach(System.out::print);
        }
    }
}

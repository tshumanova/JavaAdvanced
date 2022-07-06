package Java_Advanced.Iterators.Exercise_2_MultidimensionalArrays;

import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);

            }
        }
        int mainDiagonalSum = 0;
        for (int counter = 0; counter < size; counter++) {
            mainDiagonalSum += matrix[counter][counter];
        }
        int secondDiagSum = 0;
        for (int row = 0, col = size - 1; row < size; row++, col--) {
            secondDiagSum += matrix[row][col];
        }
        int result = Math.abs(mainDiagonalSum - secondDiagSum);
        System.out.println(result);
    }
}

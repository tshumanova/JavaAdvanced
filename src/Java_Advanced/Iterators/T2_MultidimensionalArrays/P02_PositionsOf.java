package Java_Advanced.Iterators.T2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowColumn = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(rowColumn[0]);
        int col = Integer.parseInt(rowColumn[1]);
        int[][] matrix = getMatrix(scanner, row, col);
        int number = Integer.parseInt(scanner.nextLine());

        boolean found = false;

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (matrix[i][j]==number) {
                    System.out.println(i + " " +j);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("not found");
    }

    private static int[][] getMatrix(Scanner console, int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;

    }
}

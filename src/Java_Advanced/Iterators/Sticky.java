package Java_Advanced.Iterators;

import java.util.Scanner;

public class Sticky {

    public static boolean DillingerIsInMatrix = true;
    public static int robingAmount = 0;
    public  static  int totalRobingAmount= 0;
    public  static  boolean DillingerIsCaught= false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int raw= -1;
        int col = -1;
        int size = Integer.parseInt(scan.nextLine());
        String [] command= scan.nextLine().split(",");
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            String line = scan.nextLine();
            matrix[i] = line.toCharArray();

            if (line.contains("D")) {
                raw = i;
                col = line.indexOf("D");
            }
        }
        for (int i = 0; i < command.length; i++) {
            switch (command[i]) {
                case "right":
                    moveDillinger(matrix, raw, col, 0, 1);
                    break;
                case "left":
                    moveDillinger(matrix, raw, col,0, -1);
                    break;
                case "down":
                    moveDillinger(matrix, raw, col,1, 0);
                    break;
                case "up":
                    moveDillinger(matrix, raw,col,-1, 0);
                    break;

            }
        }
        if(DillingerIsCaught) {
            System.out.println("Your last theft has finished successfully with " +
                    +totalRobingAmount + "$ in your pocket.");
        }else{
            System.out.println("You got caught with " +totalRobingAmount +"$, and you are going to jail.");
        }
        print2dcharArray(matrix);
    }


    static void moveDillinger(char[][] matrix, int raw, int col, int rawMutator, int colMutator) {
        int nextRaw =0;
        nextRaw=raw + rawMutator;
        int nextCol = col + colMutator;
        boolean isCaught = false;

        if (!IndexValid(matrix, nextCol, nextRaw)) {
            DillingerIsInMatrix = false;
            nextRaw = raw - rawMutator;
            nextCol = col - colMutator;
            System.out.println("You cannot leave the town, there is police outside!");

        }
        if (matrix[nextRaw][nextCol] == '$') {
            robingAmount = nextCol * nextCol;
            totalRobingAmount += robingAmount;
            System.out.println("You successfully stole "+ robingAmount +"$.");
        } else if (matrix[nextRaw][nextCol] == 'P') {
            matrix[nextRaw][nextCol] = '#';
            DillingerIsCaught= true;
            return;
        }
        matrix[raw][col] = '+';
        //  matrix[nextRaw][nextCol] = 'D';
        raw = nextRaw;
        col = nextCol;


    }


    static boolean IndexValid(char[][] matrix, int nextCol, int nextRaw) {
        return nextRaw >= 0 && nextRaw < matrix.length
                && nextCol >= 0 && nextCol < matrix[nextRaw].length;
    }


    static void print2dcharArray(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }


    }
}


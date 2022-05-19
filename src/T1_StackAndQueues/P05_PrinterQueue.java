package T1_StackAndQueues;

import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();

        while (!fileName.equals("print")) {
            if (fileName.equals("cancel"))

                fileName = scanner.nextLine();
        }
    }
}

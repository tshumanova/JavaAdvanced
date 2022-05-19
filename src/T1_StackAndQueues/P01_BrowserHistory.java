package T1_StackAndQueues;

import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String currentURL = "blank";
        while (!command.equals("Home")) {
            if (command.equals("back")) {

            } else {
                currentURL = command;
            }


            command = scanner.nextLine();
        }
    }
}


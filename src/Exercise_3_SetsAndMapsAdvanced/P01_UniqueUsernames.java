package Exercise_3_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUsernames = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        for (int i = 0; i < numberOfUsernames; i++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }
        for (String username : usernames) {
            System.out.println(username);
        }
        //  usernames.forEach(System.out::println);
        //username.forEach(username -> System.out.print(username);
    }
}

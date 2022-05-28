package Exercise_3_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while (!name.equals(("stop"))) {
            String email = scanner.nextLine();
            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com")) {
                emails.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (var personAndEmail : emails.entrySet()) {
            System.out.printf("%s -> %s%n", personAndEmail.getKey(), personAndEmail.getValue());
        }

    }
}

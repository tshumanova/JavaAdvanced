package T3_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        String reservationNumber = scanner.nextLine();
        while (!reservationNumber.equals(("PARTY")) {


            reservationNumber = scanner.nextLine();
        }
    }
}

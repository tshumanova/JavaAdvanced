package Java_Advanced.Iterators.T3_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guest = new TreeSet<>();

        String reservationNumber = scanner.nextLine();
        while (!reservationNumber.equals("PARTY")) {


            guest.add(reservationNumber);
            reservationNumber = scanner.nextLine();
        }
        String guestReservation = scanner.nextLine();
        while (!guestReservation.equals("END")) {
            guest.remove(guestReservation);


            guestReservation = scanner.nextLine();
        }
        System.out.println(guest.size());

        System.out.println(String.join(System.lineSeparator(), guest));

    }
}

package Exercise_1_WorkingWithAbstraction.P3_CardsWithPower;

import Exercise_1_WorkingWithAbstraction.P02_CardRank.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());

        Card card=new Card(cardSuits,cardRank);

        System.out.printf("Card name: %s of %s; Card power: {power of rank + power of suit}",card.getCardRank(),card.getCardSuits());
    }
}

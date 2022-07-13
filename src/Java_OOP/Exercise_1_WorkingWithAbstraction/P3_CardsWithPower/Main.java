package Exercise_1_WorkingWithAbstraction.P3_CardsWithPower;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardRanks cardRanks = Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardRanks.valueOf(scanner.nextLine());
        Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardSuits cardSuits = Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardSuits.valueOf(scanner.nextLine());

        Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.Card card = new Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.Card(cardSuits, cardRanks);

        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRanks(), card.getCardSuits(), card.getPower());
    }
}

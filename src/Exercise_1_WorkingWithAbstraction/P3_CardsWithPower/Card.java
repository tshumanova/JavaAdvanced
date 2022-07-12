package Exercise_1_WorkingWithAbstraction.P3_CardsWithPower;

import Exercise_1_WorkingWithAbstraction.P02_CardRank.CardRank;

public class Card {
    private CardSuits cardSuits;
    private CardRank cardRank;

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardSuits cardSuits) {
        this.cardSuits = cardSuits;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public Card(CardSuits cardSuits, CardRank cardRank) {
        this.cardSuits = cardSuits;
        this.cardRank = cardRank;
    }
}

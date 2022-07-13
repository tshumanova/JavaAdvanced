package Exercise_1_WorkingWithAbstraction.P3_CardsWithPower;



public class Card {
    private Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardSuits cardSuits;
    private Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardRanks cardRanks;

    public Card(Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardSuits cardSuits, Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardRanks cardRanks) {
        this.cardSuits = cardSuits;
        this.cardRanks = cardRanks;
    }

    public Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardSuits getCardSuits() {
        return cardSuits;
    }

    public Exercise_1_WorkingWithAbstraction.P3_CardsWithPower.CardRanks getCardRanks() {
        return cardRanks;
    }




    public int getPower(){
        return cardRanks.getRanksPower()+ cardSuits.getSuitPower();
    }
}

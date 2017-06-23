package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_4.TestEnum2;

/**
 * Created by Ruble on 16.06.2017.
 */
public class Card
{
    Main.Suit cardSuit;
    Main.Rank cardRank;

    public Card(Main.Suit cardSuit, Main.Rank cardRank)
    {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "The Card: " + cardRank + "_" + cardSuit;
    }
}

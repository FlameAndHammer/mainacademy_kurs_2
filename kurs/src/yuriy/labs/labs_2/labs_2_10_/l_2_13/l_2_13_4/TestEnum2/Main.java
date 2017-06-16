package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_4.TestEnum2;

/**
 * Created by Ruble on 16.06.2017.
 */
public class Main {
    enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
    enum Suit {SPADE, DIAMOND, CLUB, HEART};
    public class Card{
        Suit cardSuit;
        Rank cardRank;

        public Card(Suit cardSuit, Rank cardRank) {
            this.cardSuit = cardSuit;
            this.cardRank = cardRank;
        }

        @Override
        public String toString() {
            return "The Card: " + cardRank + "_" + cardSuit;
        }
    }

    public static void main(String[] args) {
        Card[][] cardDeck = new Card[13][4];
        Rank [] ranks = Rank.values();
      /* for (int i = 0; i < ranks.length; i++)
       {
           System.out.println(ranks[i]);
       }*/
        Suit [] suits = Suit.values();
        for (int i = 0; i < 13; i++)
        {
            for (int y = 0; y < 4; y++)
            {
                //cardDeck[i][y] = new Card(Suit (suits[y]),ranks[i]);

            }
        }

    }
}

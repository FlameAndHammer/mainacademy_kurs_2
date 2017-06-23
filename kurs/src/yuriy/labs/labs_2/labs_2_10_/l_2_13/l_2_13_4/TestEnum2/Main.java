package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_4.TestEnum2;

import java.util.Arrays;

/**
 * Created by Ruble on 16.06.2017.
 */
public class Main {
    enum Rank {ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
    int value;
    Rank (int val){
        value = val;
    }};
    enum Suit {SPADE, DIAMOND, CLUB, HEART};
    public static class Card{
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
        Suit [] suits = Suit.values();
        for (int i = 0; i < 13; i++)
        {
            for (int y = 0; y < 4; y++)
            {
                cardDeck[i][y] = new Card(suits[y],ranks[i]);

                System.out.println(cardDeck[i][y]);
                cardDeck[i][y].toString();

            }
        }


    }
}

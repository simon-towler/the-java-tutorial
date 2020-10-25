package playing_cards;

import java.util.*;

public final class Deck {
  private List<Card> cards = new ArrayList<>();

  public static void main(String... args) {
    Deck deck = new Deck();
    System.out.println(deck.toString());
  }

  Deck() {
    // generate a deck of cards
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(suit, rank);
        cards.add(card);
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (Card card : cards) {
           sb.append(card.toString() + "\n");
    }
    return sb.toString();
  }

}

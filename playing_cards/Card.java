package playing_cards;

final class Card {
  private Suit suit;
  private Rank rank;

  // constructor
  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  @Override
  public String toString() {
    return rank.toString() + " of " + suit.toString();
  }

}

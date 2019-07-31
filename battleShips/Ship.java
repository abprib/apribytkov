package Lessons.battleShips;

import java.util.ArrayList;

class Ship{
  int fieldSize;
  int decks;
  ArrayList<Deck> decksList = new ArrayList<Deck>(); 

  void setFieldSize(int fieldSize){
    this.fieldSize = fieldSize;
  }
  void setDecks(int decks){
    this.decks = decks;
  }
  void addDeck(int x, int y){
    Deck deck = new Deck();
    deck.setCoordinate(x, y);
    deck.setCondition('#');
    decksList.add(deck);
  }
}

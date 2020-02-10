package module3.homeWork1;

import java.util.ArrayList;

public class TestDeckMethods {
    public  static void main (String [] args){
        Deck deck = new Deck();

        ArrayList <ArrayList<String>> deckForPrint = deck.createDeck();
        deck.printDeck(deckForPrint);
    }
}

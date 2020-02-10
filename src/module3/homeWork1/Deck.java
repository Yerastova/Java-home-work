package module3.homeWork1;

import java.util.ArrayList;


public class Deck {
    public ArrayList <ArrayList<String>> createDeck () {
        ArrayList <ArrayList<String>> deck = new ArrayList<ArrayList<String>>();
        ArrayList <String> suit = new ArrayList<String>();
        suit.add("Diamonds");
        suit.add("Clubs");
        suit.add("Hearts");
        suit.add("Spades");

        ArrayList <String> range = new ArrayList<String>();
        for (int i = 2; i<=10; i++) {
            range.add(Integer.toString(i));
        }

        range.add("Jack");
        range.add("Queen");
        range.add("King");
        range.add("Ace");


        for (int i = 0; i< range.size(); i++) {
            for (int j = 0; j < suit.size(); j++){
                PlayingCard card = new PlayingCard(range.get(i), suit.get(j));
                deck.add(card.getCard());
            }
        }

        return deck;

    }

    public void printDeck (ArrayList <ArrayList<String>> deckForPrint ) {

        for (int i = 0; i< deckForPrint.size(); i++){
            System.out.println(deckForPrint.get(i));
        }
    }

    public void showFullDeck () {
        ArrayList <ArrayList<String>> deckForPrint = createDeck();
        printDeck(deckForPrint);
    }

    ArrayList <ArrayList<String>> deckForPrint = createDeck();



}



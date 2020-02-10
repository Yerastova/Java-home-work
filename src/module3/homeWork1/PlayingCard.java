package module3.homeWork1;

import java.util.ArrayList;
import java.util.List;

public class PlayingCard {
    String rank;
    String suit;

    public PlayingCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;


    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public ArrayList <String> getCard (){
        ArrayList<String> card = new ArrayList<>();
        card.add(getRank());
        card.add(getSuit());
        return card;
    }


}

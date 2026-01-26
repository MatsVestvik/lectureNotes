package testclasses;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> cards; 

    public Deck() {
         cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getRandomCard() {
        if (cards.isEmpty()) {
            System.out.println("The deck is empty.");
            return null;
        }
        int randomIndex = (int) (Math.random() * cards.size());
        Card randomCard = cards.get(randomIndex);
        return randomCard;
    }
}

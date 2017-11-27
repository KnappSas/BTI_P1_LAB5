package cardProcessor;


import java.util.*;

import cards.Card;


public class CardProcessor {
    
    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den uebergebenen Karten.
     * Welche Karte konkret entfernt wird ist egal.
     * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt, aber sonst jede Karten erhalten bleibt. 
     *
     * @param cards     die uebergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return          die Karten befreit von Doppelten.
     */
    public Card[] removeDuplicates(Card[] cards) {
    	Set<Card> cardSet = new HashSet<>();
    	for(int i = 0; i < cards.length; i++) {	
    		cardSet.add(cards[i]);
    	}
    	
    	return cardSet.toArray(new Card[cardSet.size()]);
    }
    
}//class

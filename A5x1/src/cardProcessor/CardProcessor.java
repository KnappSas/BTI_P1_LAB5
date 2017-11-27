package cardProcessor;

import java.util.*;

import cards.Card;
import cards.Deck;
/**
 * CardProcessor - see task
 */
public class CardProcessor {
	/**
	 * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel bis
	 * eine gewuenschte Karte gezogen wird und gibt danach alle gezogenen Karten in
	 * umgekehrter Reihenfolge wieder aus.
	 *
	 * @param deck
	 *            der Kartenstapel von dem die Karten gezogen werden.
	 * @param lastCard
	 *            die gewuenschte Karte, die die Ziehung beendet.
	 * @param dbgOutputEnable
	 *            true schaltet Kontrollausgabe an und false aus.
	 */
	public void reverseOrder(Deck deck, Card lastCard, boolean dbgOutputEnable) {
		Stack<Card> resultStack = new Stack<>();
		Card c;
		do
		{
			c = deck.deal();
			if (dbgOutputEnable)
				System.out.println(c);
			resultStack.push(c);
		} while (!c.equals(lastCard));
		
		//print array in reverse order
		while(!resultStack.empty()) {
			System.out.print(resultStack.pop());
		}
	}

}// class

package cardComparator;

import cards.Card;

import java.util.Comparator;

public class UsualOrder implements Comparator<Card> {
	
	/**
	 * Order by card rank. If equal order by suit using remapping getSuitValue(Card)
	 * @param card1 first card
	 * @param card2 second card
	 * @return value >= 1 when card2 should be first, < 0 when card1 should be first, 0 when equal
	 */  
	@Override
	public int compare(Card card1, Card card2) {
		int tmp = card2.getRank().ordinal() - card1.getRank().ordinal();
		return tmp != 0 ? tmp : getSuitValue(card2)-getSuitValue(card1);
	}

	/**
	 * @param card Card which Suit value should be remapped
	 * @return remapped suit value
	 */
	private int getSuitValue(Card card) {
		switch (card.getSuit()) {
		case CLUB:
			return 3;
		case SPADES:
			return 2;
		case HEART:
			return 1;
		case DIAMOND:
			return 0;
		default:
			return -1;
		}
	}
}

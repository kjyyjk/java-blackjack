package blackjack.domain.gambler;

import blackjack.domain.card.Card;
import java.util.List;

public class Dealer {
    public static final Name DEALER_NAME = new Name("딜러");
    private static final int DEALER_DRAW_THRESHOLD = 17;

    private final Gambler gambler = new Gambler(DEALER_NAME);

    public void hit(final Card card) {
        gambler.hit(card);
    }

    public int calculateScore() {
        return gambler.calculateScore();
    }

    public boolean isBust() {
        return gambler.isBust();
    }

    public boolean isBlackjack() {
        return gambler.isBlackjack();
    }

    public boolean isNameEquals(final Name name) {
        return gambler.isNameEquals(name);
    }

    public boolean mustDraw() {
        return gambler.calculateScore() < DEALER_DRAW_THRESHOLD;
    }

    public int calculateScoreDifference(final Player other) {
        return gambler.calculateScore() - other.calculateScore();
    }

    public List<Card> getCards() {
        return gambler.getCards();
    }

    public List<Card> getInitialCards() {
        List<Card> cards = getCards();
        Card firstCard = cards.getFirst();
        return List.of(firstCard);
    }
}

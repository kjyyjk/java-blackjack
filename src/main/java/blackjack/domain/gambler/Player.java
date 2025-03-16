package blackjack.domain.gambler;

import blackjack.domain.betting.BettingAmount;
import blackjack.domain.card.Card;
import java.util.List;

public class Player {
    private Gambler gambler;
    private BettingAmount bettingAmount;

    public Player(final Gambler gambler) {
        this.gambler = gambler;
    }

    public Player(final Name name) {
        this.gambler = new Gambler(name);
    }

    public void bet(final BettingAmount bettingAmount) {
        this.bettingAmount = bettingAmount;
    }

    public BettingAmount getBettingAmount() {
        return bettingAmount;
    }

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

    public Name getName() {
        return gambler.getName();
    }

    public List<Card> getCards() {
        return gambler.getCards();
    }

    public List<Card> getInitialCards() {
        return gambler.getCards();
    }
}

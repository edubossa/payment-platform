package br.com.ntk.gateway;

/**
 * Created by wallace on 12/07/17.
 */
public class Payment {

    private Card card;

    public Card getCard() {
        if (card == null) card = new Card();
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}

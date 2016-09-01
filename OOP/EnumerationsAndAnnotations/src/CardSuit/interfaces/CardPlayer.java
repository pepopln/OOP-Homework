package CardSuit.interfaces;

import CardSuit.Card;

public interface CardPlayer extends Player{

    void addCard(Card card);

    Card getHighestCard();

}

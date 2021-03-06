package CardSuit.models;



import CardSuit.Card;
import CardSuit.interfaces.CardPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CardPlayerImpl implements CardPlayer {

    private List<Card> cards;
    private String name;

    public CardPlayerImpl(String name) {
        this.cards = new ArrayList<>();
        this.setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public void addCard(Card card) {
        this.cards.add(card);

    }

    @Override
    public Card getHighestCard() {
         this.cards=this.cards.stream().sorted(Card::compareTo).collect(Collectors.toList());
        return this.cards.get(0);
    }
}

package CardSuit.enums;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int rankSuit;

    Suit(int power) {
        this.setSuit(power);
    }

    private void setSuit(int power) {
        this.rankSuit = power;
    }

    public int getRankSuit() {
        return this.rankSuit;
    }
}

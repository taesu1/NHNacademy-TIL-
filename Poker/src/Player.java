import java.util.ArrayList;
import java.util.List;

public class Player {

    ArrayList<Card> hand;
    private final String name;
    private HandRank handRank;
    private Card card;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setHand(List<Card> hand) {
        this.hand = new ArrayList<Card>(hand);
    }

    public ArrayList<Card> getHand() {
        ArrayList<Card> copyHand = new ArrayList<>();

        for (Card card : hand) {
            copyHand.add(card);
        }

        return copyHand;

    }

    public HandRank getHandRank() {
        return handRank;
    }

    public void setHandRank(HandRank handRank) {
        this.handRank = handRank;
    }

    public Card getCard() {
        return this.card;
    }
    public void setCard(Card card){
            this.card = card;
    }

}

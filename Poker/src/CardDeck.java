import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDeck {
    private List<Card> deck = new LinkedList<>();

    // 카드덱 (52장) 초기화
    private CardDeck() {

        for (Suits s : Suits.values()) {
            for (Number n : Number.values()) {
                deck.add(new Card(s, n));
            }
        }
    }

    public static CardDeck getCardDeckInstance() {
        return new CardDeck();
    }

    // 플레이어에게 카드 배분
    public void shuffle(Player player) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int randomIndex = (int) (Math.random() * deck.size());
            Card card = deck.get(randomIndex);
            hand.add(card);
            if(player.getCard() == null ){
                player.setCard(card);
            } else if(player.getCard().getNumber().getValue() < card.getNumber().getValue()){
                player.setCard(card);
            }
            deck.remove(randomIndex);
        }

        player.setHand(hand);

    }

    // 플레이어 족보 확인 & 등급부여
    public static void handCheck(Player player) {
        ArrayList<Card> hand = player.getHand();
        int value = 0;

        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            for (int j = i + 1; j < hand.size(); j++) {
                if (j == hand.size()) {
                    break;
                } else if (card.equals(hand.get(j))) {
                    value++;
                    break;
                }
            }
        }

        switch (value) {
            case 0: {
                player.setHandRank(HandRank.HIGHCARD);
                break;
            }
            case 1: {
                player.setHandRank(HandRank.ONEPAIR);
                break;
            }
            case 2: {
                player.setHandRank(HandRank.TWOPAIR);
            }
        }

    }

}

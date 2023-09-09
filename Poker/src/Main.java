import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        
    public static void main(String[] args) {
        // 플레이어 & 카드덱(52장)생성
        List<Player> players = Table.setPlayers();
        CardDeck cardDeck = CardDeck.getCardDeckInstance();

        // 플레이어들에게 카드 분배
        for (Player player : players) {
            cardDeck.shuffle(player);
        }

        // 각각 플레이어 족보 확인
        for(Player player : players){
            CardDeck.handCheck(player);
        }
        
        // 플레이어들의 족보 결과로 승리여부 확인
        Table.checkGameResult(players);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {
    //플레이어 초기화하는 메서드
    public static List<Player> setPlayers() {
        List<Player> players = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= 3; i++) {
                System.out.printf("플레이어(%d)이름>", i);
                players.add(new Player(scanner.nextLine()));
            }

        } catch (Exception e) {
            System.out.println("잘못된 입력입니다");
        }
        return players;

    }


    public static void checkGameResult(List<Player> players){
        Player winner = null;

        for(Player player : players){
            
            if(winner == null){
                winner = player;
            } else {
                // 플레이어의 족보랭크 비교로 winner를 선정
                int playerHandRank = player.getHandRank().getValue();
                int winnerHandRank = winner.getHandRank().getValue();
                
                if(playerHandRank > winnerHandRank){
                    winner = player;
                }else if(playerHandRank == winnerHandRank){
                    int winnerCardValue = winner.getCard().getNumber().getValue();
                    int playerCardValue = player.getCard().getNumber().getValue();
                    if(winnerCardValue > playerCardValue){
                        continue;
                    } else{
                        winner = player;
                    }
                }
            }
        }

            System.out.printf("게임의 승자는 %s입니다! [%s]족보로 이겼습니다 핸드 : %s", winner.getName(),winner.getHandRank(),winner.getHand().toString());
        
    }

    

}

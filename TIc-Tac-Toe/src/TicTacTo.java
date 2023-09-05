import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TicTacTo {

    public static void main(String[] args) {
        // 게임 보드판 생성

        String[][] board = Board.CreateBoard(3);

        //player 생성
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("첫번째 플레이어의 이름을 입력하세요 : ");
            Player player1 = new Player(scanner.nextLine(), 'o');
            System.out.print("두번째 플레이어의 이름을 입력하세요 : ");
            Player player2 = new Player(scanner.nextLine(), 'x');
            System.out.printf("게임을 시작합니다.");

            outer:
            while (true) {
                boolean loofControl1 = true;
                inner1:
                while (loofControl1) {
                    loofControl1 = false;
                    try {
                        System.out.printf("%s 차례 좌표 선택 (x,y) >", player1.getName());
                        String point1 = scanner.nextLine();
                        StringTokenizer pointToken1 = new StringTokenizer(point1, ",");
                        int pointX1 = Integer.parseInt(pointToken1.nextToken());
                        int pointY1 = Integer.parseInt(pointToken1.nextToken());
                        player1.pick(pointX1, pointY1, board);
                        if (Board.boardCheck(board, player1)) {
                            System.out.printf("%s님이 이겼습니다 게임을 종료합니다. ", player1.getName());
                            break outer;
                        } else if (Board.isDraw(board)) {
                            System.out.println("비겼습니다 게임을 종료합니다");
                            break outer;
                        }
                    } catch (IllegalArgumentException e) {
                        loofControl1 = true;
                    } catch (NoSuchElementException e) {
                        System.out.println("좌표 지정 오류 올바른 방식으로 재시도 ");
                        loofControl1 = true;
                    }
                }
                boolean loofControl2 = true;
                inner2:
                while (loofControl2) {
                    loofControl2 = false;
                    try {
                        System.out.printf("%s 차례 좌표 선택 (x,y) >", player2.getName());
                        String point2 = scanner.nextLine();
                        StringTokenizer pointToken2 = new StringTokenizer(point2, ",");
                        int pointX2 = Integer.parseInt(pointToken2.nextToken());
                        int pointY2 = Integer.parseInt(pointToken2.nextToken());
                        player2.pick(pointX2, pointY2, board);
                        if (Board.boardCheck(board, player2)) {
                            System.out.printf("%s님이 이겼습니다 게임을 종료합니다. ", player2.getName());
                            break outer;
                        } else if (Board.isDraw(board)) {
                            System.out.println("비겼습니다 게임을 종료합니다");
                            break outer;
                        }


                    } catch (IllegalArgumentException e) {

                        loofControl2 = true;
                    } catch (NoSuchElementException e) {

                        System.out.println("좌표 지정 오류 올바른 방식으로 재시도 ");
                        loofControl2 = true;

                    }
                }


            }


        }


    }
}

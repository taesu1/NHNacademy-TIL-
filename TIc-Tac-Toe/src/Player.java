public class Player {
    private final String name;
    private final char symbol;

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public Player(String name, char symbol) {
        if (!(symbol == 'o' || symbol == 'x')) {
            throw new IllegalArgumentException("심볼은 'x' 또는 'o'만 가능 합니다");
        } else {
            this.name = name;
            this.symbol = symbol;
        }
    }

    public void pick(int x, int y, String[][] board) throws IllegalArgumentException {

        if (x > board[0].length || y > board.length || x <= 0 || y <= 0) {
            System.out.println("잘못된 입력 값 입니다 다시 입력해 주세요");
            return;
        }
        x--;
        y--;


        if (board[y][x].isEmpty()) {
            board[y][x] = symbol + " ";
            Board.boardPrint(board);
        } else {

            System.out.println("이미 표시된 위치 입니다");
            throw new IllegalArgumentException();
        }


    }

}

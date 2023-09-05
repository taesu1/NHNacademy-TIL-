public class Board {
    private Board() {
    }

    public static String[][] CreateBoard(int size) {
        String[][] board = new String[size][size];

        for (String[] block : board) {
            for (int i = 0; i < block.length; i++) {
                block[i] = "";
            }
        }

        return board;


    }


    public static void boardPrint(String[][] board) {
        for (String[] block : board) {
            for (int i = 0; i < block.length; i++) {
                System.out.print(block[i]);
            }
            System.out.println();
        }
    }

    public static boolean boardCheck(String[][] board, Player player) {
        String symbol = player.getSymbol() + " ";
        int lastNum = 2;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][0].equals(symbol) && board[i][1].equals(symbol) && board[i][2].equals(symbol)) ||
                    (board[0][i].equals(symbol) && board[1][i].equals(symbol) && board[2][i].equals(symbol))
            ) {
                return true;
            }

        }

        return (board[0][0].equals(symbol) && board[1][1].equals(symbol) && board[2][2].equals(symbol)) ||
                (board[0][2].equals(symbol) && board[1][1].equals(symbol) && board[2][0].equals(symbol));

    }

    public static boolean isDraw(String[][] board) {

        for (String[] block : board) {
            for (int i = 0; i < block.length; i++) {
                if (block[i].isBlank()) {
                    return false;
                }
            }
        }
        return true;
    }


}

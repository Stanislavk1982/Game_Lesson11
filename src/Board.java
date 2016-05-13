import java.util.Arrays;

public class Board {
    private char[][] board = new char[3][3];
    private Player playerX;
    private Player player0;
    private Player currentPlayer;
    private Player winner, looser;

    public Board(Player playerX, Player player0) {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        this.player0 = player0;
        this.playerX = playerX;
        currentPlayer = playerX;
    }

    public void printBoard() {
        System.out.println("    0    1    2");
        System.out.println(" ┌──┬──┬──┐");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "│ " + board[i][0] + " │  " + board[i][1] + " │ " + board[i][2] + " │");
            if (i < 2) {
                System.out.println(" ├──┼──┼──┤");
            }
        }
        System.out.println(" └──┴──┴──┘");
    }

    public boolean makeMove(String move) {
        if (move.length() != 2) {
            return false;
        }
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));
        if (!isMoveValid(x, y)) {
            return false;
        }
        board[x][y] = currentPlayer.getType();
        changeCurrentPlayer();
        return true;

    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || x < 0 || y > 2 || y < 0 || board[x][y] == 'X' || board[x][y] == '0') {
            return false;
        }
        return true;
    }

    private void changeCurrentPlayer() {
        if (currentPlayer.getType() == 'X') {
            currentPlayer = player0;
        } else {
            currentPlayer = playerX;
        }
    }

    public boolean gameFinished() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {

                calaculateWin(board[i][0]);
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                calaculateWin(board[0][i]);
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            calaculateWin(board[0][0]);
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            calaculateWin(board[0][2]);
            return true;
        }
        return false;
    }

    public Player gameWinner() {
        return winner;
    }
    public Player gameLooser() {
        return looser;
    }

    public void calaculateWin(char type) {
        if (type == 'X') {
            winner = playerX;
            looser = player0;

        } else {
            winner = player0;
            looser = playerX;
        }

    }

    public void currentPlayerMove() {
        System.out.println("Players " + currentPlayer + " moves");
        System.out.print("Enter you moves");
    }
    public void winAndStatistic(Statistic statistic) {
        System.out.println("The winner is: " + gameWinner());
        GAmeResult resultWinner = new GAmeResult(gameWinner(), "winner");
        GAmeResult resultLooser = new GAmeResult(gameLooser(), "looser");
        statistic.addResult(resultWinner);
        statistic.addResult(resultLooser);
    }
}

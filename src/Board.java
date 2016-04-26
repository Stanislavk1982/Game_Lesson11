import java.sql.Array;
import java.util.Arrays;

public class Board {
    private char[][] board = new char[3][3];
    private char currentPlayer;
    private char Winner = ' ';

    public Board() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
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
        board[x][y] = currentPlayer;
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
        if (currentPlayer == 'X') {
            currentPlayer = '0';
        } else {
            currentPlayer = 'X';
        }
    }

    public boolean gameFinished() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                Winner = board[i][0];
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                Winner = board[0][i];
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            Winner = board[0][0];
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            Winner = board[0][2];
            return true;
        }
        return false;
    }

    public void gameWinner() {
        System.out.println("The winner is: Player " + Winner);
    }
public void currentPlayerMove() {
    System.out.println("Players " + currentPlayer + " moves");
    System.out.print("Enter you moves");
}
}

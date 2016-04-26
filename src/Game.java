import java.util.Scanner;

/**
 * Created by Стивен on 25.04.2016.
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play game");
        Board board = new Board();
        board.printBoard();
        String move;
        do {


            board.currentPlayerMove();
            move = scanner.next();
            if (!board.makeMove(move)) {
                System.out.println("Error, you enter incorect coordinates or field is busy");
            }

            board.printBoard();

        } while (!board.gameFinished());

        board.gameWinner();

    }
}

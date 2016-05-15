import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Statistic statistic = new Statistic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start the Game?");
        String input = scanner.next();

        while (!input.equals("exit")) {
            System.out.println("Let's play game");
            Player playerX = new Player("Ivanov", "Ivan", "Ivanovich", 25, 'X');
            Player playerO = new Player("Petrov", "Petr", "Petrovich", 35, '0');
            Board board = new Board(playerX, playerO);
            board.printBoard();
            while (!board.gameFinished()) {
                board.currentPlayerMove();
                String move = scanner.next();
                board.makeMove(move);
                board.printBoard();
            }
            board.winAndAddStatistic(statistic);
            System.out.println("Do you play again?");
            input = scanner.next();
        }
        statistic.viewStatistics();

    }
}

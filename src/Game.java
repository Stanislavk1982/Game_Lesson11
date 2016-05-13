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
                if (!board.makeMove(move)) {
                    System.out.println("Error, you enter incorect coordinates or field is busy");
                }
                board.printBoard();
            }
            board.winAndStatistic(statistic);
            System.out.println("Do you play again?");
            input = scanner.next();
        }
        System.out.println(statistic.toString());
        System.out.println("What statistic you want?");
        input = scanner.next();
        statistic.viewS(input);

    }
}

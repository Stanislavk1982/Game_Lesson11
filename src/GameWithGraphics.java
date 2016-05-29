import javax.swing.*;

public class GameWithGraphics {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Graphics();
                System.out.println("Test");
                Board board = new Board();
                board.enterPlayer();

            }
        });
    }
}

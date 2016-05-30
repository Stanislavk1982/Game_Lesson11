import javax.swing.*;

public class GameWithGraphics {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new Graphics();
                GraphicButtonStatistic gbs = new GraphicButtonStatistic();
                Graphics graphiocs = new Graphics();
                GraphicsButton gb = new GraphicsButton();
                JTextArea textArea = graphiocs.getTextArea();
                textArea.setText("Test");
                JButton buttonTest1 = gb.getButton3();
                buttonTest1.setText("Test1");
                gb.setButton5(buttonTest1);

                JButton buttonTest2 = gbs.getButtonWinner();
                buttonTest2.setText("Test2");
                gbs.setButtonWinner(buttonTest1);

            }
        });
    }
}

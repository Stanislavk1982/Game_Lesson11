import javax.swing.*;
import java.awt.*;

public class Graphics extends JFrame {

    private JTextArea textArea;
    private JButton button;
    GraphicsButton gb = new GraphicsButton();
    GraphicButtonStatistic gbStatistics = new GraphicButtonStatistic();

    public Graphics() {
        super("Sea battle");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int x = screen.width;
        int y = screen.height;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((int) Math.round(x * 0.8), (int) Math.round(y * 0.8));
        setLocationRelativeTo(null);
        setVisible(true);

        LayoutManager layoutManager = new BorderLayout(5, 5);
        setLayout(layoutManager);

        textArea = new JTextArea();

        Dimension textAreaSize = textArea.getPreferredSize();
        //System.out.println();
        textAreaSize.width = 300;
        textAreaSize.height = 100;
        textArea.setPreferredSize(textAreaSize);

        add(gb, BorderLayout.WEST);
        add(textArea, BorderLayout.EAST);
        add(gbStatistics, BorderLayout.SOUTH);
        //gb.but2("2222");
    }


}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicButtonStatistic extends JPanel {
    private JButton buttonWinner = new JButton("Winner");
    private JButton buttonLoser = new JButton("Loser");
    private GraphicsButton gb = new GraphicsButton();

    public GraphicButtonStatistic() {
        LayoutManager layoutManager = new FlowLayout((FlowLayout.CENTER));
        setLayout(layoutManager);

        add(buttonWinner, layoutManager);
        add(buttonLoser, layoutManager);

        buttonWinner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gb.but2("111133");
            }
        });

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsButton extends JPanel {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public GraphicsButton() {
        Dimension dimension = new Dimension();
        dimension.height = 100;
        dimension.width = 100;

        button1 = new JButton("");
        button1.setPreferredSize(dimension);
        button2 = new JButton("");
        button2.setPreferredSize(dimension);
        button3 = new JButton("");
        button3.setPreferredSize(dimension);
        button4 = new JButton("");
        button4.setPreferredSize(dimension);
        button5 = new JButton("");
        button5.setPreferredSize(dimension);
        button6 = new JButton("");
        button6.setPreferredSize(dimension);
        button7 = new JButton("");
        button7.setPreferredSize(dimension);
        button8 = new JButton("");
        button8.setPreferredSize(dimension);
        button9 = new JButton("");
        button9.setPreferredSize(dimension);

        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        add(button1, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        add(button2, gc);

        gc.gridx = 2;
        gc.gridy = 0;
        add(button3, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        add(button4, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        add(button5, gc);

        gc.gridx = 2;
        gc.gridy = 1;
        add(button6, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        add(button7, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        add(button8, gc);

        gc.gridx = 2;
        gc.gridy = 2;
        add(button9, gc);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("----");

            }
        });

    }

    public void but2(String str) {
        button2.setText(str);
    }
}

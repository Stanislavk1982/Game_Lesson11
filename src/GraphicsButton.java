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

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public void setButton5(JButton button5) {
        this.button5 = button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public void setButton6(JButton button6) {
        this.button6 = button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public void setButton7(JButton button7) {
        this.button7 = button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public void setButton8(JButton button8) {
        this.button8 = button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public void setButton9(JButton button9) {
        this.button9 = button9;
    }

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

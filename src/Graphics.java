import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics extends JFrame {

    private JTextArea textArea;
    public JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    GraphicsButton gb = new GraphicsButton();
    private JButton buttonq;
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
        /*gbStatistics.getButtonWinner().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("TestTest-----");
                gb.but2("q1w2e3");
            }
        }); */
        button1 = gb.getButton1();
        button2 = gb.getButton2();
        button3 = gb.getButton3();
        button4 = gb.getButton4();
        button5 = gb.getButton5();
        button6 = gb.getButton6();
        button7 = gb.getButton7();
        button8 = gb.getButton8();
        button9 = gb.getButton9();
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setText("Test9");
                }
        });
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

}

package digitalClock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockMain extends JFrame{

    JLabel jlabClock;
    ClockThread ct;

    public ClockMain() {
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jlabClock);
        setSize(1200, 120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClockMain();
    }
}

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
        jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 45));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.DARK_GRAY);
        jlabClock.setForeground(Color.blue);
        add(jlabClock);
        setSize(480, 120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClockMain();
    }
}

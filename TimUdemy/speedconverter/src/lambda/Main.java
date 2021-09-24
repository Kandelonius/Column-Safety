package lambda;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Java - 8 Action-Listener");

        Button button = new Button("click me");
        button.setBounds(40, 80, 60, 40);

        button.addActionListener(e -> System.out.println("This button uses a lambda expression"));
        frame.add(button);

        frame.setSize(150, 150);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

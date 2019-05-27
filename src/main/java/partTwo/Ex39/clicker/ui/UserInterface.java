package partTwo.Ex39.clicker.ui;

import clicker.applicationlogic.PersonalCalculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private PersonalCalculator personalCalculator;

    public UserInterface() {
        this.personalCalculator = new PersonalCalculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        JLabel counterText = new JLabel(String.valueOf(personalCalculator.giveValue()));
        JButton button = new JButton("Click!");

        container.add(counterText, BorderLayout.NORTH);
        container.add(button, BorderLayout.SOUTH);

        ClickListener clickListener = new ClickListener(personalCalculator, counterText);
        button.addActionListener(clickListener);
    }

    public JFrame getFrame() {
        return frame;
    }
}

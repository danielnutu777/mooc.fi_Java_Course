package partTwo.Ex38.noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(500,300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);

        JTextField firstArea = new JTextField("I was copied here from the JTextArea.");
        JButton button = new JButton("Copy!");
        JLabel lastArea = new JLabel();

        ActionEventListener actionEventListener = new ActionEventListener(firstArea, lastArea);
        button.addActionListener(actionEventListener);

        container.add(firstArea);
        container.add(button);
        container.add(lastArea);
    }
}

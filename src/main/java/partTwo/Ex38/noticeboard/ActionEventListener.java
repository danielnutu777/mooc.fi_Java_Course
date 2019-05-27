package partTwo.Ex38.noticeboard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListener implements ActionListener {

    private JTextField firstArea;
    private JLabel secondArea;

    public ActionEventListener(JTextField firstArea, JLabel secondArea) {
        this.firstArea = firstArea;
        this.secondArea = secondArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.secondArea.setText(firstArea.getText());
        this.firstArea.setText("");
    }
}

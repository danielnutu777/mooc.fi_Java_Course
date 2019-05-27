package partTwo.Ex39.clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

    private Calculator personalCalculator;
    private JLabel label;

    public ClickListener(Calculator calculator, JLabel label) {
        this.personalCalculator = calculator;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        personalCalculator.increase();
        label.setText(String.valueOf(personalCalculator.giveValue()));
    }
}
